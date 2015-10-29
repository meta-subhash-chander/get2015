/****************************************************************************************
Name            : CreateController
Revision Log    : 2015-10-25: Subhash Chander : created.
                : 
                : 
Use             : This class is used to control create Car by admin                 
 ****************************************************************************************/
package com.controller;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Car;
import com.model.Vehicle;
import com.service.VehicleDekhoService;
import com.Exceptions.VehicleDekhoSystemException;

 
@WebServlet("/CreateController")
public class CreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CreateController() {
        super();
        
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);
	}

	 /**
   	 * doPost method : take car detail from webPage and send the responce to create.jsp page
   	 * 
   	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Vehicle vehicle = createCar(request);  
		VehicleDekhoService service = new VehicleDekhoService();
		boolean isCreated = false;
		try {
			isCreated = service.createVehicle(vehicle);
		} catch (VehicleDekhoSystemException e) {
			System.out.print("\n car can't created due to : "+e.getMessage());
		}
		if(isCreated) {
			request.setAttribute("message", "Car created successfully");
		} else {
			request.setAttribute("message", "Car already exist");
		}
		getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);
	}
	
	/**
   	 * createCar method : create the object of car by requset page data
   	 * @return : object of car
   	 * 
   	 */
	private Vehicle createCar(HttpServletRequest request){
		Vehicle vehicle = new Car();
		vehicle.setCreated_By(request.getParameter("name"));
		vehicle.setCreated_Time(Calendar.getInstance().getTime());
		vehicle.setEnginInCC(Integer.parseInt(request.getParameter("enginecc")));
		vehicle.setFuelCapacity(Integer.parseInt(request.getParameter("fuelcapacity")));
		vehicle.setMake(request.getParameter("make"));
		vehicle.setMilage(Integer.parseInt(request.getParameter("milage")));
		vehicle.setModel(request.getParameter("model"));
		vehicle.setPrice(Double.parseDouble(request.getParameter("price")));
		Double roadTax = (Double.parseDouble(request.getParameter("price")))/10.0;
		vehicle.setRoadTax(roadTax);
		((Car) vehicle).setAC(false);
		((Car) vehicle).setAccessoryKit(false);
		((Car) vehicle).setPowerSteering(false);
		if(request.getParameter("ac").equals("yes")) {
			((Car) vehicle).setAC(true);
		}
		if(request.getParameter("accessorykit").equals("yes")) {
			((Car) vehicle).setAccessoryKit(true);
		}
		if(request.getParameter("powersteering").equals("yes")) {
			((Car) vehicle).setPowerSteering(true);
		}
		return vehicle;
	}

}

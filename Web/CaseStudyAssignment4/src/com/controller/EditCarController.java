/****************************************************************************************
Name            : EditCarController
Revision Log    : 2015-10-25: Subhash Chander : created.
                : 
                : 
Use             : This class is used to control Edit Car by admin                 
 ****************************************************************************************/
package com.controller;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helper.VehicleJDBCHelper;
import com.model.Car;
import com.model.Vehicle;

/**
 * Servlet implementation class EditCarController
 */
@WebServlet("/EditCarController")
public class EditCarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditCarController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * doGet method : take the data like car company , car model and redirect it
	 * to editDetail.jsp page
	 * 
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("make", request.getParameter("make"));
		request.setAttribute("model", request.getParameter("model"));
		getServletContext().getRequestDispatcher("/editdetails.jsp").forward(
				request, response);
	}

	/**
	 * doPost method : take the data of car and update it into database also use
	 * to delete the car
	 * 
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Vehicle vehicle = updateCar(request);
		if (request.getParameter("type").equals("Update")) {
			VehicleJDBCHelper.updateByMakeAndModel(vehicle);

		} else {
			VehicleJDBCHelper.deleteByMakeModel(request.getParameter("make"),
					request.getParameter("model"));
		}
		getServletContext().getRequestDispatcher("/AdminHome.jsp").forward(
				request, response);
	}

	/**
	 * updateCar method : the object of car by requset page data
	 * 
	 * @return : object of car
	 * 
	 */
	private Vehicle updateCar(HttpServletRequest request) {
		Vehicle vehicle = new Car();
		vehicle.setCreated_By(request.getParameter("name"));
		vehicle.setCreated_Time(Calendar.getInstance().getTime());
		vehicle.setEnginInCC(Integer.parseInt(request.getParameter("enginecc")));
		vehicle.setFuelCapacity(Integer.parseInt(request
				.getParameter("fuelcapacity")));
		vehicle.setMake(request.getParameter("make"));
		vehicle.setMilage(Integer.parseInt(request.getParameter("milage")));
		vehicle.setModel(request.getParameter("model"));
		vehicle.setPrice(Double.parseDouble(request.getParameter("price")));
		Double roadTax = (Double.parseDouble(request.getParameter("price"))) / 10.0;
		vehicle.setRoadTax(roadTax);
		((Car) vehicle).setAC(false);
		((Car) vehicle).setAccessoryKit(false);
		((Car) vehicle).setPowerSteering(false);
		if (request.getParameter("ac").equals("yes")) {
			((Car) vehicle).setAC(true);
		}
		if (request.getParameter("accessorykit").equals("yes")) {
			((Car) vehicle).setAccessoryKit(true);
		}
		if (request.getParameter("powersteering").equals("yes")) {
			((Car) vehicle).setPowerSteering(true);
		}
		return vehicle;
	}

}

/****************************************************************************************
Name            : AdminHomeController
Revision Log    : 2015-10-25: Subhash Chander : created.
                : 
                : 
Use             : This class is used to control admin home pages
                :
 ****************************************************************************************/
package com.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Exceptions.VehicleDekhoSystemException;
import com.service.VehicleDekhoService;
 
@WebServlet("/AdminHomeController")
public class AdminHomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public AdminHomeController() {
        super();
    }
    /**
	 * doGet method :this method call the VehicleDekhoService class ,get profile method send responce to adminhome page
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Map<String, String> profile;
		 VehicleDekhoService service = new VehicleDekhoService();
		try {
			profile = service.getProfile();
			request.setAttribute("profile", profile);
		} catch (VehicleDekhoSystemException e) {
			System.out.println("Can't fetch profile due to : "+e.getMessage());
		}
		getServletContext().getRequestDispatcher("/AdminHome.jsp").forward(request, response);
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

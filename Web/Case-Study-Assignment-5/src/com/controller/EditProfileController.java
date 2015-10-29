/****************************************************************************************
Name            : EditProfileController
Revision Log    : 2015-10-25: Subhash Chander : created.
                : 
                : 
Use             : This class is used to edit profile of admin               
 ****************************************************************************************/
package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.VehicleDekhoService;
import com.Exceptions.VehicleDekhoSystemException;
 
@WebServlet("/EditProfileController")
public class EditProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
    public EditProfileController() {
        super();
         
    }

	/**
	 * this method get administrator profile from database and dispatch result to editprofile.jsp
	 * @param profile: holds profile of administrator from database  
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		VehicleDekhoService service = new VehicleDekhoService();
		try {
			Map<String, String> profile = service.getProfile();
			request.setAttribute("profile", profile);
		} catch (VehicleDekhoSystemException e) {
			System.out.println(e.getMessage());
		}
		getServletContext().getRequestDispatcher("/editprofile.jsp").forward(request, response);
	}

	/**
	 * this method update the profile of administrator in database
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
			List<String> profileData = new ArrayList<String>();
			profileData.add(request.getParameter("email"));
			profileData.add(request.getParameter("name"));
			profileData.add(request.getParameter("password"));
			profileData.add(request.getParameter("contact"));
			profileData.add(request.getParameter("address"));
			VehicleDekhoService service = new VehicleDekhoService();
			try {
				service.updateProfile(profileData);
			} catch (VehicleDekhoSystemException e) {
				
				System.out.println("\n Could not update admin profile due to : "+e.getMessage());
			}
			request.getRequestDispatcher("AdminHomeController").forward(request, response);
	}

}

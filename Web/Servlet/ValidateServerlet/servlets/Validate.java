package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Validate() {
        super();
    }
    
    private int validation(String userName, String psw) {
    	int i = 0;
    	String nameRagix = "^[a-z0-9_-]{3,15}$";
    	String pswRagix =  "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
    	Pattern namePattern = Pattern.compile(nameRagix);
    	Pattern pswPattern = Pattern.compile(pswRagix);
    	Matcher nameMatcher = namePattern.matcher(userName);
    	Matcher pswMatcher = pswPattern.matcher(psw); 
    	if(!nameMatcher.matches()) {
    		i=1;
    	}
    	else if(!pswMatcher.matches()) {
    		i=2;
    	}
    	return i;
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("name");
		String psw = request.getParameter("password");
		int result = validation(userName, psw);
		String output = userName+psw;
		if(result == 0){
			output = "Profile Successfully Created"; 
		}
		else if(result == 1) {
			output = "Please enter correct user name";
		}
		else {
			output = "Please enter correct password (password should have more than 8 letters)";
		}
		request.setAttribute("result", output);
		request.getRequestDispatcher("ShowResult").forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}

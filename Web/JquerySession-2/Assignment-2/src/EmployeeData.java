

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/EmployeeData")
public class EmployeeData extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	 
		String empName = request.getParameter("name");
		String detail = "";
		switch(empName)
		{
		case "Subhash": detail="Name: Subhash   Age:22 Dob:19-09-1992  Address:Hanumangarh";break;
		case "Banwari": detail="Name: Banwari kewat Age:22 Dob:19-09-1992  Address:Guna";break;
		case "Girdhari": detail="Name: Girdhari Age:22 Dob:19-09-1994  Address:UP";break;
		case "Dheeraj": detail="Name: Dheeraj Age:23 Dob:19-07-1992  Address:jaipur";break;
		}
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(detail);

	}

	 
}

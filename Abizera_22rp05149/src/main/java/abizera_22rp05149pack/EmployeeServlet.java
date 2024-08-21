package abizera_22rp05149pack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 String action = request.getParameter("action");

		    if ("list".quals(action)) {
		    		
		    	List<Employee>employees=getAllEmployees();
		    	request.setAttribute("employees",employees);
		    	request.getRequestDispatcher("employeeList.jsp").forward(request, response);
		    } else if ("edit".equals(action)) {
		    	int id = Integer.parseInt(request.getParameter("id"));
		        Employee employee = getEmployeeById(id);
		        request.setAttribute("employee", employee);
		        request.getRequestDispatcher("updateEmployee.jsp").forward(request, response);
		    } else if ("view".equals(action)) {
		    	int id-Integer.parseInt((request.getparameter("id"));
		    	Employee Employee=getEmployeeById(id);
		    	request.setAttribute("employee", employee);
		    	request.getRequestDispatcher("viewEmployee.jsp").forward(request, response);
		    }
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

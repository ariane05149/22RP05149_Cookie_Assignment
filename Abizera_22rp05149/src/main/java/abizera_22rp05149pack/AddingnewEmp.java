package abizera_22rp05149pack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddingnewEmp
 */
@WebServlet("/AddingnewEmp")
public class AddingnewEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddingnewEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @param management 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response, Object management) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String emp_name=request.getParameter("name");
		String pass=request.getParameter("pass");
		String position=request.getParameter("postition");
		String department=request.getParameter("department");
		String Email=request.getParameter("Email");
		String phone=request.getParameter("phone");
		 try (Connection conn = DatabaseUtil.getConnection()) {
	            String sql = "INSERT INTO employees (name, password, position, department, email, phone) VALUES (?, ?, ?, ?, ?, ?)";
	            PreparedStatement stmt = conn.prepareStatement(sql);
	            stmt.setString(1, emp-name);
	            stmt.setString(2, pass);
	            stmt.setString(3, position);
	            stmt.setString(4, department);
	            stmt.setString(5, email);
	            stmt.setString(6, phone);
	            int rowsInserted = stmt.executeUpdate();
if (rowsInserted>0) {
	response.sendRedirect(employeeList.jsp").forward(request,response);
}
catch(Exception e) {
	e.printStackTrace();
	request.setAttribute("errorMessage", e Database error");"
			+ "request.getRequestDispacher("addEmployee.jsp").forward(request,response);
}
		
		
		
		boolean isAdded=employee-management.addEmployee(emp_name,pass,position,department,Email,phone);
		if(isAdded) {
			response.sendRedirect("employeeList.jsp");}
		else {request.setAttribute("errorMessage","Error adding employee");
		request.getRequestDispatcher("addEmployee.jsp").forward(request, response);
		}
		
	}

}

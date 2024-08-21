package abizera_22rp05149pack;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
	String action=request.getParameter("action");
	if("add".equals(action)) {
		addEmployee(request);
		response.sendRedirect(EmployeeServlet?action=list");"
				}
				else if("update".equals(action)){"
						deleteEmployee(Integer.parseInt(request.getParameter("id")));
		response.sendRedirect("EmployeeServlet?action=list");
				}}
	private connection getconnection() throws SQLException{
		String url="jdbc:mysql://localhost:3306/ems";
		String password="password";
		return DriverManager.getConnection(url,user,password);
	}
	private List<Employees(){
		List<Employee>employees=new ArrayList<>();
		ResultSet rs=stmt.excuteQuery("SELECT *FROM employee")){
			while(rs.next()) {
				employee.add(new Employee(rs.getInt("id"),rs.getString("name");
			}
 catch(SQLException e) {
	 e.printStackTrace();
 }
return employee;
	}

}

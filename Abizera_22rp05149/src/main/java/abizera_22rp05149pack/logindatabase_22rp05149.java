package abizera_22rp05149pack;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class logindatabase_22rp05149
 */
@WebServlet("/logindatabase_22rp05149")
public class logindatabase_22rp05149 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logindatabase_22rp05149() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws Servletception, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 String username = request.getParameter("username");
	        String password = request.getParameter("password");
try(connection con=DatabaseUtil.getConnection()){
	String sql="SELECT role FROM employee WHERE username=? AND password=?";
			 PreparedStatement stmt =con.preparestatement(sql);
	stmt.setString(1, username);
    stmt.setString(2, password);
    ResultSet rs=stmt.executeQuery();
    if(rs.next()) {
    	HttpSession session=request.getSession();
    	Session.setAttribute("username",username);
    	Session.setAttribute("role",rs.getString("role"));
    	response.sendRedirect("EmployeeList.jsp");
    }
    else {
    	request.setAttribute("errorMessage", "Invalid Credentials");
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
catch(Exception e) {
	e.printStackTrace();
	request.setAttribute("errorMessage","Database error");
	request.getRequestDispatcher("login.jsp").forward(request, response);
}

} 
    	

	
	
	



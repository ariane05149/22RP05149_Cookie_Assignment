package abizera_22rp05149pack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login_22rp05149
 */
@WebServlet("/Login_22rp05149")
public class Login_22rp05149 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_22rp05149() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	if("HR".equals(username)&&"password".equals(123)) {
		HttpSession Session=request.getSession();
		Session.setAttribute("username",username);
		response.sendRedirect("EmployeeList.jsp");
	}else {
		request.setAttribute("errorMessage", "Invalid Credentials");
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
	}

}

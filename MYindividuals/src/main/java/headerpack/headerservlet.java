package headerpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class headerservlet
 */
@WebServlet("/headerservlet")
public class headerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public headerservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        String userAgent = request.getHeader("User-Agent");
        String host = request.getHeader("Host");
        String acceptLanguage = request.getHeader("Accept-Language");

        StringBuilder htmlResponse = new StringBuilder();
        htmlResponse.append("<html><body>");
        htmlResponse.append("<h2>Client Header Information</h2>");
        htmlResponse.append("<p><strong>User-Agent:</strong> ").append(userAgent).append("</p>");
        htmlResponse.append("<p><strong>Host:</strong> ").append(host).append("</p>");
        htmlResponse.append("<p><strong>Accept-Language:</strong> ").append(acceptLanguage).append("</p>");
        htmlResponse.append("</body></html>");

        response.getWriter().write(htmlResponse.toString());
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
protected void doPost(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
       }

       }
   
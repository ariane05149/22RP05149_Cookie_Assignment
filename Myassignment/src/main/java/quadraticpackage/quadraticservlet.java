package quadraticpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class quadraticservlet
 */
@WebServlet("/quadraticservlet")
public class quadraticservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public quadraticservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Quadratic Equation Solver</h2>");
        out.println("<form method='post'>");
        out.println("a: <input type='text' name='a'><br>");
        out.println("b: <input type='text' name='b'><br>");
        out.println("c: <input type='text' name='c'><br>");
        out.println("<input type='submit' value='Calculate Roots'>");
        out.println("</form>");

        String aStr = request.getParameter("a");
        String bStr = request.getParameter("b");
        String cStr = request.getParameter("c");

        if (aStr != null && bStr != null && cStr != null) {
            try {
                double a = Double.parseDouble(aStr);
                double b = Double.parseDouble(bStr);
                double c = Double.parseDouble(cStr);

                double discriminant = b * b - 4 * a * c;

                if (discriminant > 0) {
                    double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                    out.println("<h3>Roots are real and different:</h3>");
                    out.println("Root 1: " + root1 + "<br>");
                    out.println("Root 2: " + root2);
                } else if (discriminant == 0) {
                    double root = -b / (2 * a);
                    out.println("<h3>Roots are real and the same:</h3>");
                    out.println("Root: " + root);
                } else {
                    out.println("<h3>Roots are complex:</h3>");
                    double realPart = -b / (2 * a);
                    double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                    out.println("Root 1: " + realPart + " + " + imaginaryPart + "i<br>");
                    out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
                }
            } catch (NumberFormatException e) {
                out.println("<h3>Please enter valid numbers for a, b, and c.</h3>");
            }
        }

   
        out.println("<br><a href='quadraticservlet'>Calculate Again</a>");
        out.println("</body></html>");
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
package errorpack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/status")
public class ResponseCodeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve 'errorType' parameter from the request
        String errorType = request.getParameter("errorType");
        
        // Prepare the response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (errorType == null) {
            // Default message
            out.println("<html><body>");
            out.println("<h1>error code servlet</h1>");
            out.println("<p>Use 'errorType' parameter to test different error codes.</p>");
            out.println("<ul>");
            out.println("<li><a href='status?errorType=404'>Generate 404 Not Found</a></li>");
            out.println("<li><a href='status?errorType=500'>Generate 500 Internal Server Error</a></li>");
            out.println("</ul>");
            out.println("</body></html>");
        } else {
            // Generate different status codes based on 'errorType' parameter
            switch (errorType) {
                case "404":
                    response.sendError(HttpServletResponse.SC_NOT_FOUND, "Page Not Found");
                    break;
                case "500":
                    response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Internal Server Error");
                    break;
                default:
                    response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid error type specified");
                    break;
            }
        }
    }
}

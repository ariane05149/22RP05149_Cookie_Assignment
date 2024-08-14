package fileapploadpack;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/upload")
@MultipartConfig
public class FileUploadServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            Part filePart = request.getPart("file");
            String fileName = filePart.getSubmittedFileName();
            String uploadDir = getServletContext().getInitParameter("uploadDir");
            if (uploadDir == null) {
                uploadDir = "uploads";
            }

           
            File uploadDirFile = new File(uploadDir);
            if (!uploadDirFile.exists()) {
                uploadDirFile.mkdir();
            }File file = new File(uploadDir, fileName);
            filePart.write(file.getAbsolutePath());

            out.println("<h1>the file is successfully uploaded!</h1>");
            out.println("<p>File Name: " + fileName + "</p>");
            out.println("<p><a href=\"uploads.html\">Go back</a></p>");

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h1>Failed to upload file!</h1>");
            out.println("<p><a href=\"uploads.html\">Go back</a></p>");
        }
    }
}

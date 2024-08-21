package abizera_22rp05149pack;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LOGINSERVLETDB
 */
@WebServlet("/LOGINSERVLETDB")
public class LOGINSERVLETDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private  static final String URL ="jdbc:mysqli://localhost:3306/ems";
       private static final String USER="root";
       public static boolean addEmployee(String name,String postion,String Department) {
    	   try(Connection conn=DriverManager,getConnection(URL,USER,PASSWORD)){
    		   String sql="INSERT INTO employees(name,postion,department)VALUES(?,?,?)";
    		   PreparedStatement stm=conn.prepareStatement(sql);
    		   Object stmt;
			stmt.setString(1,name);
    		   stmt.setString(2,position);
    		   stmt.setString(3,Department);
    		   return stmt.excuteUpdate()>0;}
    	   catch(SQLException e) {
    		   
    		   e.fillInStackTrace();
    		   return false;
    	   }}
    		   
    	   
       }
  



package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 679918
 */
public class MainPageServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
     String logout = request.getParameter("LoggedOut");
     
     if(logout != null)
     {
         request.setAttribute("LoggedOut", "Logged Out");
         getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
     }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

    
    }
        
    

}

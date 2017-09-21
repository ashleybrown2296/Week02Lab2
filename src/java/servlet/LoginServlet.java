
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 679918
 */
public class LoginServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        
 
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                         
      
        // get the parameters from the URL
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        
        
        if (username == null || password == null || username.isEmpty() || password.isEmpty())
            {
            
           request.setAttribute("errorMessage", "Both values are required!");
           request.setAttribute("username", username);
           request.setAttribute("password", password);    
           getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);

            return;
            }
        
         UserService us = new UserService();
         boolean valid = us.login(username, password);
        
        
         
         if(!valid)
         {
          request.setAttribute("username", username);
          request.setAttribute("password", password);
          request.setAttribute("errorMessage", "Invalid username or password!");

          getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
         }
        request.setAttribute("username", username);
        request.setAttribute("password", password);    
        getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").forward(request, response);

        
    }
   
}


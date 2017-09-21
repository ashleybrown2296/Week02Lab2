
package servlet;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
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
public class UserService extends HttpServlet {
    
    private String[] userName = {"adam", "betty"};
    private String password = "password";
    
    public  boolean login(String username, String password){
        boolean valid = false;
        
        for(String user : userName)
            if(user.equals(username))
                if(this.password.equals(password))
                valid = true;
            
        return valid;
       }

}


         
 

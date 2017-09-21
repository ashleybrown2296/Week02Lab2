<%-- 
    Document   : login
    Created on : Sep 18, 2017, 2:27:53 PM
    Author     : 679918
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="Login" method="POST">
            <p>Username:<input type="text" name="username" value="${username}"></p>
            <p>Password:<input type="text" name="password" value="${password}"></p>
            <br><input type="submit" value="Submit">
        </form>
         ${errorMessage}
         ${logout}
        
    </body>
</html>

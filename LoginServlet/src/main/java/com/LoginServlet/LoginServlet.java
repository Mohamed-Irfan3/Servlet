package com.LoginServlet;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.DigestException;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpRequest request, HttpResponse response) throws DigestException, IOException {
        String username = ((Object) request).getParameter("username");
        String password = ((Object) request).getParameter("password");

    
        System.out.println("Received Login Request:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);


        if (isValidLogin(username, password)) {
            ((Object) response).sendRedirect("welcome.jsp");
        } else {
            ((Object) response).sendRedirect("login.html");
        }
    }

    private boolean isValidLogin(String username, String password) {
 
        return username != null && !username.isEmpty() && password != null && !password.isEmpty();
    }
}
package com.LoginServlet;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.DigestException;

public class SignUpServlet extends HttpServlet {

    protected void doPost(HttpRequest request, HttpResponse response) throws DigestException, IOException {
        String username = ((Object) request).getParameter("username");
        String password = ((Object) request).getParameter("password");

        System.out.println("Received Sign Up Request:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

 
        ((Object) response).sendRedirect("login.html");
    }
}
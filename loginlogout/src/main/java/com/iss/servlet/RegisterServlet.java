package com.iss.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.IOException;

import com.iss.dao.User;
import com.iss.dao.UserDao;
import com.iss.dao.UserDaoImp;


public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static UserDao  userDao = new UserDaoImp();

    public RegisterServlet() {
        super();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        System.out.println("Control aaya");


        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);

        if (userDao.addUser(user)) {

            response.sendRedirect("login.jsp?registration=success");
        } else {

            response.sendRedirect("register.jsp?error=1");
        }
    }

}
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.so.users;
//
//import com.so.med.Users;
//import com.so.med.domain.HibernateUtil;
//import com.so.med.domain.UserServiceImpl;
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
///**
// *
// * @author Ќюта
// */
//public class AddUsersServlet extends HttpServlet {
//    
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        
//        String login = request.getParameter("login");
//        String pass = request.getParameter("pass");
//        String firstname = request.getParameter("firstname");
//        String lastname = request.getParameter("lastname");
////        String roles = request.getParameter("roles");
//        String email = request.getParameter("email");
//        Users user = new Users();
//        user.setLogin(login);
//        user.setPass(pass);
//        user.setFirstname(firstname);
//        user.setLastname(lastname);
//        user.setRoles(Users.Roles.valueOf(request.getParameter("roles")));
//        user.setEmail(email);
//        
//        //.......
//        int id = new UserServiceImpl().addUser(user);
//        
//        if(id > 0){
//            response.sendRedirect("users");
//        }else{
//            response.sendRedirect("404.html");
//        }
//        
//    }
//    
//}

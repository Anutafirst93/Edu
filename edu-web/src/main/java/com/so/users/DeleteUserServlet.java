//package com.so.users;
//
//import com.so.med.domain.UserServiceImpl;
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author ����
// */
//public class DeleteUserServlet extends HttpServlet {
//    
//     @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String iduser = request.getParameter("id");
//        boolean resalt = new UserServiceImpl().deleteUser(Integer.parseInt(iduser));
//        if (!resalt){
//        throw new ServletException();
//        }
//        response.sendRedirect("mentors");
//    }
//    
//}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web;

import com.so.med.Users;
import com.so.med.domain.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Нюта
 */
@Controller
public class UserMgmtConroller {
    @Autowired       
    private UserDao userDao;
    
    @RequestMapping(value = {"/", "/users"}, method = {RequestMethod.GET})
    public ModelAndView getUsersList (){
        ModelAndView model = new ModelAndView();
        model.addObject("title", "привед кросавчеги");
        model.addObject("userlist", userDao.userList());
        model.setViewName("helloworld");
//        for(Users u :userDao.userList()) System.out.println(u);
        return model;
    }
    
    
    @RequestMapping(value = {"/users/edituser/{id}"}, method = {RequestMethod.GET})
    public ModelAndView editUser (@PathVariable("id") Integer id){
        ModelAndView model = new ModelAndView();
        Users u = userDao.getUser(id);
        model.addObject("user", u);
        model.addObject("userid", u.getId());
        model.addObject("acceptedRoles", Users.Roles.values());
        model.setViewName("edituser");
//        for(Users u :userDao.userList()) System.out.println(u);
        return model;
    }
    
    @RequestMapping(value = {"/users/edituser"}, method = {RequestMethod.POST})
    public String saveUser (
            @RequestParam("id") Integer id,
            @RequestParam("login") String login,
            @RequestParam("firstname") String firstname,
            @RequestParam("lastname") String lastname,
            @RequestParam("roles") String roles,
            @RequestParam("email") String email){
        Users u = null;
        if(id == 0){
            u = new Users();
        }else{
            userDao.getUser(id);
        }
        //set fields
        u.setLogin(login);
        u.setFirstname(firstname);
        u.setLastname(lastname);
        u.setRoles(roles);
        u.setEmail(email);
        
        if(id == 0){
            userDao.addUser(u);
        }else{
            userDao.updateUser(u);
        }
        return "redirect:users";
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web;

import com.edu.ukits.domain.GroupDaoImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Ќюта
 */
@Controller
public class GroupsController {
    //@Autowired       
    //private GroupDao groupDao;
    @RequestMapping(value = {"/groups"}, method = {RequestMethod.GET})
    public ModelAndView getGroupsList (){
        ModelAndView model = new ModelAndView();
        model.addObject("groups",new GroupDaoImpl().getGroupsList());
        model.setViewName("groups");
        return model;
    }
    
}

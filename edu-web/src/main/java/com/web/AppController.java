package com.web;

//import org.springframework.web.servlet.mvc.SimpleFormController;

import com.so.med.Users;
import com.so.med.domain.StudingroupDaoImpl;
import com.so.med.domain.UserDao;
import com.so.med.domain.UserDaoImpl;
import javax.enterprise.inject.Model;
import static jdk.nashorn.internal.runtime.Debug.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author ГЌГѕГІГ 
 */

//       @Controller
public class AppController {
//           @Autowired
//           StudingroupDaoImpl sg;
//           
//    private UserDao userDao;
////	@RequestMapping(value = {"/"}, method = {RequestMethod.GET})
////	public ModelAndView welcomePage() {
////		ModelAndView model = new ModelAndView();
////		model.addObject("title", "привед кросавчеги");
////		model.addObject("userlist", sg.userList());
////		model.setViewName("helloworld");
////                for(Users u :sg.userList()) System.out.println(u);
////		return model;
////	}
//        
//        
//
//	/*@RequestMapping(value = "/protected**", method = RequestMethod.GET)
//	public ModelAndView protectedPage() {
//
//		ModelAndView model = new ModelAndView();
//		model.addObject("title", "Spring Security 3.2.4 Hello World Tutorial");
//		model.addObject("message", "This is protected page - Only for Admin Users!");
//		model.setViewName("protected");
//		return model;
//
//	}*/
//
//	/*@RequestMapping(value = "/confidential**", method = RequestMethod.GET)
//	public ModelAndView adminPage() {
//
//		ModelAndView model = new ModelAndView();
//		model.addObject("title", "Spring Security 3.2.4 Hello World Tutorial");
//		model.addObject("message", "This is confidential page - Need Super Admin Role!");
//		model.setViewName("protected");
//
//		return model;
//
//	}*/
//        //UserDaoImpl id;
//        @RequestMapping(value = "/adduser", method = RequestMethod.GET)
// public String showCreateUser() {
//    return "redirect:edituser";
// }
// 
// @RequestMapping(value = "/edituser", method = RequestMethod.GET)
// public String showEditUser(@RequestParam("id") Long id) {
//     ModelAndView mv = new ModelAndView("edituser");
//    mv.addObject("user", userDao.getUser(id.intValue()));
//    return "edituser";
// }
// 

}


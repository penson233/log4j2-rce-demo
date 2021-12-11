package com.test.Controller;


import com.test.Service.Userservice;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class LoginController {
   @Resource
   private Userservice userservice;
   static final Logger logger = LogManager.getLogger(LoginController.class);

   @RequestMapping("/")
   public String get(){
      return "login";
   }

   @PostMapping("/login")
   public String post(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password, Model model) {
      if (userservice.login(username, password)) {
         model.addAttribute("success", "login success");
         return "success";
      } else {
         logger.error(username + "error");

         return "no";
      }
   }

}

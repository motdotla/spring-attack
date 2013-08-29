package com.sendgrid.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sendgrid.forms.Signup;

@Controller
public class SignupController {

  @RequestMapping("/")
  public String index(Model model) {
    model.addAttribute("signup", new Signup());
    model.addAttribute("message", "Hello World!");

    return "index";
  }

  @RequestMapping(value = "/signup", method = RequestMethod.POST)
  public String postSignup(@ModelAttribute Signup signup, Model model) {

    System.out.println(signup.getEmail());

    model.addAttribute("message", "Successfully saved signup");

    return "index";
  }

}

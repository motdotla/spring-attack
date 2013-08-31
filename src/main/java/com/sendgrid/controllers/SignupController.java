package com.sendgrid.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sendgrid.forms.Signup;
import com.github.scottmotte.sendgrid.SendGrid;


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
    
    String username   = System.getenv("SENDGRID_USERNAME");
    String password   = System.getenv("SENDGRID_PASSWORD");
    SendGrid sendgrid = new SendGrid(username, password);

    sendgrid.addTo(signup.getEmail());
    sendgrid.setFrom("scott.motte@sendgrid.com");
    sendgrid.setSubject("Welcome!");
    sendgrid.setText("You have successfully signed up!");
    String response = sendgrid.send();

    System.out.println(response);

    model.addAttribute("message", "Successfully signed up!");

    return "index";
  }

}

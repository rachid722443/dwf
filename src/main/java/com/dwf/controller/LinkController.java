package com.dwf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dwf.model.User;
import com.dwf.service.UserService;

@Controller
public class LinkController {
    
    @RequestMapping(value = "/")
    public ModelAndView mainPage() {
	ModelAndView modelAndView = new ModelAndView("login");
	modelAndView.addObject("user", new User());
	return modelAndView;
    }

    @RequestMapping(value = "/index")
    public ModelAndView indexPage() {
	ModelAndView modelAndView = new ModelAndView("login");
	modelAndView.addObject("user", new User());
	return modelAndView;
    }
}

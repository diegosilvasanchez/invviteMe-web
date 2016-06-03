package br.com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.web.model.User;

@Controller
public class UserController {

	@RequestMapping(value = "user/createAccount", method = RequestMethod.GET)
	public String index(Model model){		
		model.addAttribute("user", new User());
		return "user/createAccount";
	}
	
	@RequestMapping(value =  "user/createAccount" , method = RequestMethod.POST)
	public ModelAndView create(@ModelAttribute(value = "user") User user, Model model){
		model.addAttribute("user", user);
		return new ModelAndView("user/sucess");
	}
}
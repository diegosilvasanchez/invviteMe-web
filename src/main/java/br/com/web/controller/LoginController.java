package br.com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.web.model.Login;

@Controller
public class LoginController {

	@RequestMapping(value =  "login/login" , method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute(value = "login") Login login, Model model){
		model.addAttribute("login", login);
		return new ModelAndView("index");
	}
}
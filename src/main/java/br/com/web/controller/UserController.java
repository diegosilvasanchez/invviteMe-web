package br.com.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.web.exception.ApiException;
import br.com.web.model.User;
import br.com.web.model.client.Users;
import br.com.web.restclient.ClientApi;
import br.com.web.restclient.UriApi;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class UserController {
	
	private Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private ClientApi userApi;

	@RequestMapping(value = "user/createAccount", method = RequestMethod.GET)
	public String index(Model model){		
		model.addAttribute("user", new User());
		return "user/createAccount";
	}
	
	@RequestMapping(value =  "user/createAccount" , method = RequestMethod.POST)
	public ModelAndView createAccount(@ModelAttribute(value = "user") User user, Model model){
		
		String url = userApi.getUrlApi(UriApi.USER_CREATE);
		Map<String, Object> params = new HashMap<String, Object>();
		try {
			ObjectMapper mapper = new ObjectMapper();
			ResponseEntity<Object> response = userApi.postClient(url, user, params);
			user = mapper.convertValue(response.getBody(), User.class);
			logger.info("User "+user.getName());
		} catch (ApiException e) {		
			e.printStackTrace();
		}
		
		
		model.addAttribute("user", user);
		return new ModelAndView("user/sucess");
	}
}
package br.com.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.web.exception.ApiException;
import br.com.web.model.Login;
import br.com.web.model.User;
import br.com.web.model.client.Users;
import br.com.web.restclient.ClientApi;
import br.com.web.restclient.UriApi;

@Controller
public class IndexController {

	private Logger logger = Logger.getLogger(IndexController.class);
	
	@Autowired
	private ClientApi userApi;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView view = new ModelAndView("index");
		view.addObject(new User());
		view.addObject(new Login());
		
//		//TODO retirar apenas teste
//		String url = userApi.getUrlApi(UriApi.USER_FIND_USER_BY_ID);		
//		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("id", 1);
//		try {
//			ObjectMapper mapper = new ObjectMapper();
//			ResponseEntity<Object> response = userApi.getClient(url, params);
//			Users user = mapper.convertValue(response.getBody(), Users.class);
//			logger.info("User "+user.getName());
//		} catch (ApiException e) {		
//			e.printStackTrace();
//		}
		return view;
	}
}
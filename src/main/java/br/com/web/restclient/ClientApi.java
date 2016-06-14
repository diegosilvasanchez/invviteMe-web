package br.com.web.restclient;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.web.exception.ApiException;

@Component
public class ClientApi {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private Environment environment;

	public String getUrlApi(UriApi uriApi) {
		String host = environment.getProperty("app.url.api");
		StringBuilder url = new StringBuilder(host).append(uriApi.getUrl());
		return url.toString();
	}
        
	public ResponseEntity<Object> postClient(String url, Object resource, Map<String, Object> params) throws ApiException {    	     	 
    	try{
    		ResponseEntity<Object> response = exchangeRestTemplate(HttpMethod.POST, url, resource, params);
        	return response;
    	}catch(Exception e){
    		throw new ApiException(e.getMessage());
    	}    	
    }
	
	public ResponseEntity<Object> putClient(String url, Object resource, Map<String, Object> params) throws ApiException {    	     	 
    	try{
    		ResponseEntity<Object> response = exchangeRestTemplate(HttpMethod.PUT, url, resource, params);
        	return response;
    	}catch(Exception e){
    		throw new ApiException(e.getMessage());
    	}    	
    }
	
	public ResponseEntity<Object> deleteClient(String url, Object resource, Map<String, Object> params) throws ApiException {    	     	 
    	try{
    		ResponseEntity<Object> response = exchangeRestTemplate(HttpMethod.DELETE, url, resource, params);
        	return response;
    	}catch(Exception e){
    		throw new ApiException(e.getMessage());
    	}    	
    }
	
	public ResponseEntity<Object> getClient(String url, Map<String, Object> params) throws ApiException{    	     	 
    	try{    		
    		HttpHeaders headers = new HttpHeaders();
    	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    		HttpEntity<Object> requestEntity = new HttpEntity<Object>(headers);    	
        	ResponseEntity<Object> response =  restTemplate.exchange(url, HttpMethod.GET, requestEntity, Object.class, params);    	
        	return response;        	
       	}catch(Exception e){
       		throw new ApiException(e.getMessage());
       	}    	
    }
    
	public List<Object> getListClient(String url, Map<String, Object> params) throws ApiException{    	     	 
    	try{
    		HttpHeaders headers = new HttpHeaders();
    	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    		HttpEntity<Object> requestEntity = new HttpEntity<Object>(headers);    	
        	List<Object> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, new ParameterizedTypeReference<List<Object>>(){}, params).getBody();    	
        	return response;
       	}catch(Exception e){
       		throw new ApiException(e.getMessage());
       	}    	
    }

	private ResponseEntity<Object> exchangeRestTemplate(HttpMethod httpMethod, String url, Object resource, Map<String, Object> params) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Object> requestEntity = new HttpEntity<Object>(resource, headers);
		ResponseEntity<Object> response = restTemplate.exchange(url, httpMethod, requestEntity, Object.class, params);
		return response;
	}
}
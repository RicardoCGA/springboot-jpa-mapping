package com.exercise.springbootinit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.exercise.springbootinit.dto.GrettingRequestParam;

@RestController
public class DefaultController {

	
	@GetMapping (path = "/{name}")
	public String gretting (@PathVariable String name) {
		System.out.println(name);
		return name;
	}
	
	@GetMapping( "/")
	public String completeGreeting (
	           @RequestParam("givenName") String firstName,
	           @RequestParam("familyName") String lastName,
	           @RequestParam(name="age", required=false) Integer age,
	           @ModelAttribute("grettingRequest") GrettingRequestParam params) {
		System.out.println(params.toString());
		return params.getGivenName()+" "+params.getFamilyName()+(params.getAge()!=null?" "+params.getAge().toString():"");
	}
	
	
	
}

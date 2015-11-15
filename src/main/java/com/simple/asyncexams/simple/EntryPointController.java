package com.simple.asyncexams.simple;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryPointController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String fakeCall(){
		return "this request is normal";
	}
	
	@RequestMapping(value = "/async-simple", method = RequestMethod.GET)
	public String fakeCall2(){
		return "this request is normal";
	}
}

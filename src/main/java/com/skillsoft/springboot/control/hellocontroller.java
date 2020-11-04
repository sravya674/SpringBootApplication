package com.skillsoft.springboot.control;

import org.springframework.web.bind.annotation.*;

@RestController
public class hellocontroller {
	
	@RequestMapping(value= "/", method = RequestMethod.GET)
	public String index() {
		return "this is the main page";
		}
	@RequestMapping(value= "/welcome", method = RequestMethod.GET)
	public String welcome() {
		return "welcome to spring";
		}
	
	@RequestMapping(value= "/home", method = RequestMethod.GET)
	public String home() {
		return "hello you are inside srping";
		}
}


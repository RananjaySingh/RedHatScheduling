package com.mkyong.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	
	@Autowired
	private App app;

	private static int counter = 0;
	private static final String VIEW_INDEX = "index";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BaseController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {

	/*	model.addAttribute("message", "Welcome");
		model.addAttribute("counter", ++counter);
		logger.debug("[welcome] counter : {}", counter);*/

		// Spring uses InternalResourceViewResolver and return back index.jsp
		logger.info("HI OPENSHIFT BEFORE");
		app.test();
		logger.info("HI OPENSHIFT");
		return VIEW_INDEX;

	}

	/*@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {

		model.addAttribute("message", "Welcome " + name);
		model.addAttribute("counter", ++counter);
		logger.debug("[welcomeName] counter : {}", counter);
		return VIEW_INDEX;```````````````````

	}*/
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ResponseEntity test() {

	/*	model.addAttribute("message", "Welcome");
		model.addAttribute("counter", ++counter);
		logger.debug("[welcome] counter : {}", counter);*/

		// Spring uses InternalResourceViewResolver and return back index.jsp
		String test=app.test();
		System.out.println("Test controller");
		logger.info("HI OPENSHIFT");
		return new ResponseEntity(test, HttpStatus.OK);

	}

}

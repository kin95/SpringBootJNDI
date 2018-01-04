package com.test.web;

import javax.websocket.server.PathParam;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/base")
public interface BaseController {

	@RequestMapping("/test")
	public ModelAndView test(@PathParam("test") String test);
}

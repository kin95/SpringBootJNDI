package com.test.web.impl;

import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.test.web.BaseController;

@RestController
public class BaseControllerImpl implements BaseController {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public ModelAndView test(@PathParam("test") String test) {
		ModelAndView mv = new ModelAndView();

		List<Map<String,Object>> list = jdbcTemplate.queryForList("select user_name from sys_user where user_id='1'");
		for(Map<String,Object> map:list){
			System.out.println("============" + map + "==============");
		}
		
		mv.setViewName("test");
		mv.addObject("message", "users=" + list.toString());		
		
		return mv;
	}

}

package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalController {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	int res=Integer.parseInt(request.getParameter("no1"))+Integer.parseInt(request.getParameter("no2"));
	mv.setViewName("display.jsp");
	mv.addObject("result", res);
	return mv;
	}
		
	@RequestMapping("/sub")
	public ModelAndView sub(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	int res=Integer.parseInt(request.getParameter("no1"))-Integer.parseInt(request.getParameter("no2"));
	mv.setViewName("display.jsp");
	return mv.addObject("result", res);
	}
	
	
}


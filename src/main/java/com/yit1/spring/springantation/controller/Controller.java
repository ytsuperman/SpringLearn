package com.yit1.spring.springantation.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
@RequestMapping("controller")
public class Controller {
	@RequestMapping("data")
	public String getData() {
		System.out.println("111");
		return "data";
	}
	@RequestMapping("entryValuePage")
	public ModelAndView entryValuePageValue() {
		System.out.println("111");
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("name", "yit1");
		modelAndView.addObject("age", "14");
		return modelAndView;
	}
	@RequestMapping("param")
	public ModelAndView params(@RequestParam("id") int id) {
		System.out.println("111");
		ModelAndView modelAndView = new ModelAndView("id");
		modelAndView.addObject("id", id);
		return modelAndView;
	}
	@RequestMapping("path/{first}/{second}")
	public ModelAndView path(@RequestParam("id") int id,@PathVariable("first") String first, @PathVariable("second") String second) {
		System.out.println("111");
		ModelAndView modelAndView = new ModelAndView("path");
		modelAndView.addObject("id", id);
		modelAndView.addObject("first", first);
		modelAndView.addObject("second", second);
		return modelAndView;
	}
}

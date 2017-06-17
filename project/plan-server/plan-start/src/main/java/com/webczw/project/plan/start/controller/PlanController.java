package com.webczw.project.plan.start.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("plans")
public class PlanController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "test";
	}
}

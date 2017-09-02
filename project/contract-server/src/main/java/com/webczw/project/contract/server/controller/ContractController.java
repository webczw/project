package com.webczw.project.contract.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contracts")
public class ContractController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "test";
	}
}

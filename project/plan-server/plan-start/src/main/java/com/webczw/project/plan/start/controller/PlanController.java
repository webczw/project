package com.webczw.project.plan.start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webczw.project.plan.api.PlanBusinessException;
import com.webczw.project.plan.api.domain.PlanQueryVO;
import com.webczw.project.plan.api.domain.PlanVO;
import com.webczw.project.plan.api.service.IPlanService;

@RestController
@RequestMapping("plans")
public class PlanController {
	@Autowired
	private IPlanService planService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<PlanVO> findList(PlanQueryVO planQueryVO) throws PlanBusinessException {
		return planService.findList(planQueryVO);
	}
	@GetMapping("/{planId}")
	public PlanVO find(@PathVariable("planId") Long planId) throws PlanBusinessException{
		return planService.find(planId);
	}
	
	@PostMapping("/")
	public void create(PlanVO planVO) throws PlanBusinessException{
		planService.create(planVO);
	}

	@PutMapping("/")
	public void update(PlanVO planVO) throws PlanBusinessException{
		planService.update(planVO);
	}
	
	@DeleteMapping("/")
	public void delete(Long planId) throws PlanBusinessException{
		planService.delete(planId);
	}
}

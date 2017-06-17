package com.webczw.project.plan.api.service;

import java.util.List;

import com.webczw.project.plan.api.PlanBusinessException;
import com.webczw.project.plan.api.domain.PlanQueryVO;
import com.webczw.project.plan.api.domain.PlanVO;

public interface IPlanService {
	public List<PlanVO> findList(PlanQueryVO planQueryVO) throws PlanBusinessException;

	public PlanVO find(Long planId) throws PlanBusinessException;

	public void create(PlanVO planVO) throws PlanBusinessException;

	public void update(PlanVO planVO) throws PlanBusinessException;

	public void delete(Long planId) throws PlanBusinessException;
}

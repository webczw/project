package com.webczw.project.plan.api.dao;

import java.util.List;

import com.webczw.project.plan.api.domain.PlanQueryVO;
import com.webczw.project.plan.api.domain.PlanVO;

public interface IPlanDao {
	public List<PlanVO> findList(PlanQueryVO planQueryVO);

	public PlanVO find(Long planId);

	public void create(PlanVO planVO);
	
	public void update(PlanVO planVO);

	public void delete(Long planId);
}

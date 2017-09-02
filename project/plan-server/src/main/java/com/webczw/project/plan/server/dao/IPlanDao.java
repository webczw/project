package com.webczw.project.plan.server.dao;

import java.util.List;

import com.webczw.project.plan.server.domain.PlanQueryVO;
import com.webczw.project.plan.server.domain.PlanVO;

public interface IPlanDao {
	public List<PlanVO> findList(PlanQueryVO planQueryVO);

	public PlanVO find(Long planId);

	public void create(PlanVO planVO);
	
	public void update(PlanVO planVO);

	public void delete(Long planId);
}

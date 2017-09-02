package com.webczw.project.plan.server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webczw.project.plan.server.PlanBusinessException;
import com.webczw.project.plan.server.dao.IPlanDao;
import com.webczw.project.plan.server.domain.PlanQueryVO;
import com.webczw.project.plan.server.domain.PlanVO;
import com.webczw.project.plan.server.service.IPlanService;

@Service
public class PlanService implements IPlanService {
	@Autowired
	private IPlanDao planDao;

	public List<PlanVO> findList(PlanQueryVO planQueryVO) throws PlanBusinessException {
		return planDao.findList(planQueryVO);
	}

	public PlanVO find(Long planId) throws PlanBusinessException {
		return planDao.find(planId);
	}
	
	public void create(PlanVO planVO) throws PlanBusinessException {
		planDao.create(planVO);
	}

	public void update(PlanVO planVO) throws PlanBusinessException {
		planDao.update(planVO);
	}

	public void delete(Long planId) throws PlanBusinessException {
		planDao.delete(planId);
	}

}
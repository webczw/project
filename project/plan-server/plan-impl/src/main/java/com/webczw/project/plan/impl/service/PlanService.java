package com.webczw.project.plan.impl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webczw.project.plan.api.PlanBusinessException;
import com.webczw.project.plan.api.dao.IPlanDao;
import com.webczw.project.plan.api.domain.PlanQueryVO;
import com.webczw.project.plan.api.domain.PlanVO;
import com.webczw.project.plan.api.service.IPlanService;

@Service
public class PlanService implements IPlanService {
	@Autowired
	private IPlanDao planDao;

	@Override
	public List<PlanVO> findList(PlanQueryVO planQueryVO) throws PlanBusinessException {
		return planDao.findList(planQueryVO);
	}

	@Override
	public PlanVO find(Long planId) throws PlanBusinessException {
		return planDao.find(planId);
	}
	
	@Override
	public void create(PlanVO planVO) throws PlanBusinessException {
		planDao.create(planVO);
	}

	@Override
	public void update(PlanVO planVO) throws PlanBusinessException {
		planDao.update(planVO);
	}

	@Override
	public void delete(Long planId) throws PlanBusinessException {
		planDao.delete(planId);
	}

}

package com.webczw.project.plan.server.domain;

import java.io.Serializable;

public class PlanQueryVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4476873691170338764L;

	private Long planId;
	private String name;

	public Long getPlanId() {
		return planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

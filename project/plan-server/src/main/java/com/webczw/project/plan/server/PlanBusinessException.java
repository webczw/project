package com.webczw.project.plan.server;

public class PlanBusinessException extends Exception {

	private static final long serialVersionUID = 3457579357125495877L;

	public PlanBusinessException() {
		super();
	}

	public PlanBusinessException(String message) {
		super(message);
	}

	public PlanBusinessException(String message, Throwable cause) {
		super(message, cause);
	}

	public PlanBusinessException(Throwable cause) {
		super(cause);
	}

	protected PlanBusinessException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}

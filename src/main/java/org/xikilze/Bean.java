package org.xikilze;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("bean") @RequestScoped
public class Bean {
	private String value = "It works";

	public String getValue() {
		return value;
	}
}

package com.spring.core.bean;

/**
 * @author KaustubhWaghmare
 * Customer Implementation
 *
 */
public class CustomerImpl implements Customer {

	@Override
	public void getMessage(String msg) {
		System.out.println("Customer Message : "+ msg);
	}

	
}

package com.org.modal.NullObjectPattern;

public class RealCustomer extends AbstractCustomer {
	
	

	public RealCustomer(String name) {
		this.name=name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}

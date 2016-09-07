package com.org.modal.NullObjectPattern;

public class NullCustomer extends AbstractCustomer {

	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Not Available in Customer Database";
	}

}

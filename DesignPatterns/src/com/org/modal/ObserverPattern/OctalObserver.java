package com.org.modal.ObserverPattern;

public class OctalObserver extends Observer {
	
	

	public OctalObserver(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

		System.out.println("Octal String"+Integer.toOctalString(subject.getState()));
	}

}

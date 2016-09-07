package com.org.modal.StatePattern;

public class Context {
	private State state;
	public Context() {
		// TODO Auto-generated constructor stub
		state=null;
	}
	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
}

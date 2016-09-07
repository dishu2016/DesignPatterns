package com.org.modal.ObserverPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Subject {

	private List<Observer> observers=new ArrayList<Observer>();

	private int state;
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state=state;
		notifuAllObservers();
	}
	
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void notifuAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}

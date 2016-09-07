package com.org.modal.CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	
	private List<Order> oderList=new ArrayList<Order>();

	
	public void takeOrder(Order order){
		oderList.add(order);
	}
	
	public void placeOrders() {	
		for (Order order : oderList) {
			order.execute();
		}
		oderList.clear();
	}
}

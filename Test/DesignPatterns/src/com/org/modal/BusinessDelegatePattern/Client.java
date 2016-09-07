package com.org.modal.BusinessDelegatePattern;

public class Client {
	
	BusinessDelegate businessService;
	
	public Client( BusinessDelegate businessService) {
		// TODO Auto-generated constructor stub
		this.businessService=businessService;
	}
	
	public void doTask(){
		businessService.doTask();
	}

}

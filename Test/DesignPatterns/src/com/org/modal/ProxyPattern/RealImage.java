package com.org.modal.ProxyPattern;

public class RealImage implements Image {
	
	private String fileName;
	
	

	public RealImage(String fileName) {
		super();
		this.fileName = fileName;
		loadFromDisk(fileName);
	}



	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.println("Displaying "+fileName);
	}
	
	
	private void loadFromDisk(String fileName){
		System.out.println("Loading "+fileName);
	}

}

package com.org.modal.ProxyPattern;

public class ProxyImage implements Image {
	
	private RealImage realImage;
	
	private String fileName;
	
	

	public ProxyImage(String fileName) {

		this.fileName = fileName;
	}



	@Override
	public void display() {
		// TODO Auto-generated method stub
		if (realImage==null) {
			realImage=new RealImage(fileName);
		}
		realImage.display();
	}

}

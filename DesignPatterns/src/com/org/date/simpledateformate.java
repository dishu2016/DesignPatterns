package com.org.date;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpledateformate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String dm="123";
		StringBuffer dmnew=new StringBuffer("P");
		for(int i=7;i>dm.length();i--){
			dmnew=dmnew.append("0");
		}
		dmnew.append(dm);
		System.out.println(dmnew.toString());
	}

}

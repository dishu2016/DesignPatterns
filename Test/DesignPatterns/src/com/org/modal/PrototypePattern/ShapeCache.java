package com.org.modal.PrototypePattern;

import java.util.Hashtable;

public class ShapeCache {
	
	private static Hashtable<String,Shape> shapeMap=new Hashtable<String,Shape>();

	public static Shape getShape(String shapeId){
		Shape cacheShape=shapeMap.get(shapeId);
		return(Shape)cacheShape.clone();
	}
	
	public static void loadCache() {
		 Circle circle=new Circle();
		 circle.setId("1");
		 shapeMap.put(circle.getId(), circle);
		 
		 Squre squre=new Squre();
		 squre.setId("2");
		 shapeMap.put(squre.getId(), squre);
		 
		 Rectangle rectangle=new Rectangle();
		 rectangle.setId("3");
		 shapeMap.put(rectangle.getId(), rectangle);
	}
	
}

package com.kh.test240124;

public class CircleController {
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double area = Math.PI * c.getRadius() * c.getRadius();
		
		return "면적 : " + c.toString() + " / 넓이 : " + area;
		
	}

	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double circum = 2 * Math.PI * c.getRadius();
		return "둘레 : " + c.toString() + " / 둘레 : " + circum;
	}
}

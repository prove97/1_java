package com.kh.test240124;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
//		r = new Rectangle(x, y, height, width); 
	
		int area = r.getWidth()*r.getHeight();
		return r.toString() + " / 면적 : " + area;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
//		r = new Rectangle(x, y, height, width); 
	
		int perimeter = 2 * (r.getWidth() + r.getHeight());
		return r.toString() + " / 둘레 : " + perimeter; 
				
	}
	
	
}

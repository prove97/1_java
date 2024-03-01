package com.kh.Test240122;

public class TV {

	private String comp;
	private int year;
	private int inch;
	private int price;
	
	public TV(String comp, int year, int inch) {
		this.comp = comp;
		this.year = year;
		this.inch = inch;
	}
	
	public TV(String comp, int year, int inch, int price) {
		this.comp = comp;
		this.year = year;
		this.inch = inch;
		this.price = price;
	}
	
	public void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV : %d원\n"
				, this.comp, this.year, this.inch, this.price);
		return;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	
	
}

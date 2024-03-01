package com.kh.inherit02;

public class TV extends Product{
	private int inch; // 크기

	public TV(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override
	public String information() {
		// TODO Auto-generated method stub
		return super.information() + ", inch : " + this.inch;
	}
	
	

}

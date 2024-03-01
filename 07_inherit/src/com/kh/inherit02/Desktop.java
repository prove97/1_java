package com.kh.inherit02;

public class Desktop extends Product {
	private boolean allInOne; // 일체형인지 여부

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	// super. 으로 부모에 접근이 가능하다.
	// 오버라이딩 : 부모 클래스에 있는 메소드를 자식 클래스에서 재정의하는 것
	@Override
	public String information() {
		// TODO Auto-generated method stub
		return super.information() +", allInOne : " + this.allInOne;
		
	}

	
	
	
}

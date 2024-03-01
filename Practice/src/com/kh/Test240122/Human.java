package com.kh.Test240122;

public class Human {
	static int cnt = 0;
	String name;
	int money;
	
	public Human(String name, int money) {
		//this(name, money);
		this.name = name;
		this.money = money;
		cnt++;
	}
	
	// buy라는 메소드 작성
	// TV객체를 넘겨받아 구매가 가능하다면 "구매가 가능합니다!"
	// money가 부족하다면 "예산 초과입니다." 출력
	
	public void buy(TV tv) {
		if(tv.getPrice() <= this.money)
			System.out.println("구매가 가능합니다!");
		else System.out.println("예산 초과입니다.");
	}
}

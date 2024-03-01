package com.kh.interface01;

public class Dog implements Animal, Baby {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("촐랑촐랑 뜁니다");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("촵촵촵 먹습니다");
		
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
	
}

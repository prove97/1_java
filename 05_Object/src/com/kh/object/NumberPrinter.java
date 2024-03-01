package com.kh.object;

public class NumberPrinter {
	/*
	 * static 변수(정적멤버)
	 * 동적으로 메모리가 생기는 다른 변수들과 달리 컴파일시 정적으로
	 * 메모리 공간을 확보하고 클래스 이름으로 접근이 가능(클래스변수)하다.
	 * 정적(변하지 않는 고정메모리)변수이기 때문에 모든 객체에서 똑같은 메모리르 참조한다.
	 * 
	 * static 메소드(정적메소드)
	 * 정적변수와 동일하게 컴파일시 정적으로 메모리공간을 확보하고 
	 * 클래스 이름으로 접근이 가능하다.
	 * 다만 객체를 생성하지 않아도 호출이 가능하기 때문에 
	 * 객체 생성시 메모리 공간이 할당되는 일반변수를 메소드 내에 사용할 수 없다.
	 * 단순하고 명확한 계산 정도할 때 사용하는 것이 좋다.
	 * 
	 */
	
	
	private int myNum = 0;
	public static int cnt = 0;
	
	static void showInt(int n) {
		System.out.println(n);
	}
	
	static void showDouble(double n) {
		cnt++;
		System.out.println(n);
	}
	
	void setMyNumber(int n) {
		myNum = n;
	}
	
	static void showMyNumber() {
		showInt(cnt);
	}
	

}

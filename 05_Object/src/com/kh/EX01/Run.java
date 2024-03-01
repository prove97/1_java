package com.kh.EX01;

public class Run {

	public static void main(String[] args) {
		
////		BankAccount yoon; // yoon이라는 BankAccount의 참조변수 생성(선언)
////		BankAccount choi; // choi이라는 BankAccount의 참조변수 생성(선언)
////		
////		yoon = new BankAccount(); // yoon이 새로 생성되는 인스턴스를 가리킴
////		choi = new BankAccount(); // choi이 새로 생성되는 인스턴스를 가리킴
//	
//		// 두개의 인스턴스 객체가 생성
//		BankAccount yoon = new BankAccount();
//		BankAccount choi = new BankAccount();
//		
//		// 각각의 인스턴스 객체를 대상으로 예금을 진행
//		yoon.deposit(5000); 
//		choi.deposit(3000);
//		
//		//각각의 인스턴스 객체를 대상으로 출금 진행
//		yoon.withdraw(2000); 
//		choi.withdraw(2000);
//		
//		//각각의 인스턴스 객체의 잔액을 조회
//		yoon.checkMyBalance(); // yoon의 계좌 잔액 조회
//		choi.checkMyBalance(); // choi의 계좌 잔액 조회
//		
//		System.out.println(yoon.balanceEquals(choi));
	
	
//		String st = "hi";
//		BankAccount t = new BankAccount();
//
//		System.out.println(st.hashCode());
//		t.test(st);
//		System.out.println(st);
//		System.out.println(st.hashCode());
	
		
//		 
//		BankAccount choi = new BankAccount();
//		choi.initAccount("12-456-68", "120411-1942225", 10000);
//		
//		BankAccount yoon = new BankAccount();
//		yoon.initAccount("12-466-68", "921219-2942225", 1000);
		
		BankAccount ref1 = new BankAccount();
		BankAccount ref2 = ref1;
		
		ref1.deposit(3000);
		ref2.deposit(2000);
		ref1.withdraw(400);
		ref2.withdraw(300);
		ref1.checkMyBalance();
		ref2.checkMyBalance();
		
		String str1 = "Happy";
		String str2 = "Birthday";
		System.out.println(str1 + " " + str2);
		printString(str1);
		printString(str2);
	}
	
	public static void printString(String str) {
		System.out.println(str);
	}
	
	

}

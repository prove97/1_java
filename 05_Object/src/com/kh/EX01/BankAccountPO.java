package com.kh.EX01;

public class BankAccountPO{
	// 필드 영역
	// 클래스와 관련된 변수를 '필드'
	
	static int balance = 0; // 예금 잔액
	
	public static void main(String[] args) {
		deposit(10000); // 입금 진행
		checkMyBalance(); // 잔액 확인
		withdraw(3000); // 출금 진행
		checkMyBalance(); // 잔액 확인
	}
	
	public static int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public static int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	public static int checkMyBalance() {
		System.out.println("잔액 : "+ balance);
		return balance;
	}
	
}

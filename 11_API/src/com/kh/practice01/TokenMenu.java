package com.kh.practice01;

import java.util.Scanner;

public class TokenMenu {
	private Scanner sc;
	private TokenController tc;
	
	public TokenMenu() {
		super();
		this.sc = new Scanner(System.in);
		this.tc = new TokenController();
	}
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("===================");
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("3. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			
			int select = 0;
			
			try {
				select = sc.nextInt();
			} catch (RuntimeException e) {
				//e.printStackTrace();
				//System.out.println("다시 입력해주세요(숫자)");
			}
			
			sc.nextLine();
			
			switch(select) {
			case 1:
				this.tokenMenu();
				break;
			case 2:
				this.inputMenu();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m";
		
		// 토큰 처리 전 글자, 토큰 처리 전 개수를 출력
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		
		// TokenController(tc)의 afterToken()의 반환 값을 가지고
		String strResult = tc.afterToken(str);
		
		// 토큰 처리 후 글자, 토큰 처리 후 개수, 모두 대문자로 변환 한 것을 출력
		System.out.println("토큰 처리 후 글자 : " + strResult);
		System.out.println("토큰 처리 후 개수 : " + strResult.length());
		System.out.println("모두 대문자로 변환 : " + strResult.toUpperCase());

	}
	
	public void inputMenu() {
		// tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.next();

		str = tc.firstCap(str);
		System.out.println("첫 글자 대문자 : " + tc.firstCap(str));
		
		// tc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자를 인자로 넘겨
		System.out.print("찾을 문자를 하나 입력하세요 : ");
		char ch = sc.next().charAt(0);

		// 반환 값 출력
		System.out.println(ch + " 문자가 들어간 개수 : " + tc.findChar(str, ch));
		

	}
}

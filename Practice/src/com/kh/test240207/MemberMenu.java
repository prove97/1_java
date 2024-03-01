package com.kh.test240207;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		int select = 0;
		while(true) {
			System.out.println("========== KH 사이트 ==========");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1:
				this.joinMembership();
				break;
			case 2:
				this.logIn();
				this.memberMenu();
				break;
			case 3:
				this.sameName();
				break;
			case 9:
				System.out.println("프로그램 종료.");
				sc.close();

				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
		
	}
	
	public void memberMenu() {
		int select;
		System.out.println("******* 회원 메뉴 *******");
		System.out.println("1. 비밀번호 바꾸기");
		System.out.println("2. 이름 바꾸기");
		System.out.println("3. 로그아웃");
		System.out.print("메뉴 번호 선택 : ");
		select = sc.nextInt();
		sc.nextLine();
		
		switch(select) {
		case 1:
			this.changePassword();
			break;
		case 2:
			this.changeName();
			break;	
		case 3:
			System.out.println("로그아웃 되었습니다.");
			return;
		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
		}
	}
	
	public void joinMembership() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
			
		Member human = new Member(password, name);
		boolean isJoin = mc.joinMembership(id, human);

		if(!isJoin) {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			return;
		}
		
		System.out.println("성공적으로 회원가입 완료하였습니다.");
	}
	
	public void logIn() {
		String returnName = null;
		
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			
			returnName = mc.logIn(id, password);
			if(returnName == null) {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			} else break;
		}
		System.out.println(returnName + "님, 환영합니다!");
		
	}
	
	public void changePassword() {
		String id, oldPw, newPw;
		while(true) {
			System.out.print("아이디 : ");
			id = sc.nextLine();
			System.out.print("현재 비밀번호 : ");
			oldPw = sc.nextLine();
			System.out.print("새로운 비밀번호 : ");
			newPw = sc.nextLine();
			boolean isChange = mc.changePassword(id, oldPw, newPw);
			if(!isChange) {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			} else break;
			
		}
		System.out.println("비밀번호 변경에 성공했습니다.");
	}
	
	public void changeName() {
		String id, pw, oldName, newName;
		while(true) {
			System.out.print("아이디 : ");
			id = sc.nextLine();
			System.out.print("비밀번호 : ");
			pw = sc.nextLine();
			oldName = mc.logIn(id, pw);
			if(oldName != null) {
				break;
			} 
			System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
		}	
		System.out.println("현재 이름 : " + oldName);
		System.out.print("변경할 이름 : " );
		newName = sc.nextLine();
		mc.chageName(id, newName);
		
		System.out.println("이름 변경에 성공했습니다.");
		
	}
	
	public void sameName() {
		System.out.print("검색할 이름 : ");
		String targetName = sc.nextLine();
		TreeMap<String, String> result = mc.sameName(targetName);
		if(result.isEmpty()) {
			System.out.println("일치하는 이름이 없습니다.");
		} else {
			for(Map.Entry<String, String> entry : result.entrySet()) {
				System.out.println(entry.getValue() + "-" + entry.getKey());
			}
		}
			
	}
	
	
}

package com.kh.test240206_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		int select = 0;
		while(true) {
			System.out.println("========== KH 추첨 프로그램 ==========");
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴번호 선택 : ");
			select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1:
				insertObject();
				break;
			case 2:
				deleteObject();
				break;
			case 3:
				winObject();
				break;
			case 4:
				sortedWinObject();
				break;
			case 5:
				searchWinner();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
			
		}
		
	}
	
	public void insertObject() { // 1. 추첨 대상 추가용 view 메소드
		System.out.print("추가할 추첨 대상 수 : ");
		int cnt = sc.nextInt();
		sc.nextLine();
		
		String name, phone;
		boolean isInsert;
		for(int i = 0; i < cnt; i++) {
//			while(true) {
//				System.out.print("이름 : ");
//				name = sc.next();
//				System.out.print("핸드폰 번호('-' 빼고) : ");
//				phone = sc.next();
//				isInsert = lc.insertObject(new Lottery(name, phone));
//				if(isInsert == false) {
//					System.out.println("중복된 대상입니다. 다시 입력하세요.");
//					System.out.println();
//				} else 
//					break;
//			}
			
			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("핸드폰 번호('-' 빼고) : ");
			phone = sc.next();
			isInsert = lc.insertObject(new Lottery(name, phone));
			if(isInsert == false) {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				i--;
			}
			System.out.println();
			
		}
		
		System.out.println("추가 완료되었습니다");
	}
	
	public void deleteObject() { // 2. 추첨 대상 삭제용 view 메소드
//		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
//		System.out.print("이름 : ");
//		String name = sc.next();
//		System.out.print("핸드폰 번호('-' 빼고) : ");
//		String phone = sc.next();
//		
//		boolean isEquals = lc.deleteObject(new Lottery(name, phone));
//		if(isEquals == true) {
//			System.out.println("존재하지 않는 대상입니다.");
//		} else {
//			System.out.println("삭제 완료 되었습니다.");
//		}
		
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("핸드폰 번호('-' 빼고) : ");
		String phone = sc.next();
		boolean isDelete = lc.deleteObject(new Lottery(name, phone));
		if(!isDelete) {
			System.out.println("존재하지 않는 대상입니다.");
			return;
		} 
		System.out.println("삭제 완료 되었습니다.");
		
	}
	
	public void winObject() { // 3. 당첨 대상 확인용 view 메소드
		HashSet<Lottery> winSet = lc.winObject();
		
		if(winSet != null) {
			System.out.println(winSet);
		} else {
			System.out.println("당첨 결과가 없습니다.");
		}
	}
	
	public void sortedWinObject() { // 4. 정렬된 당첨 대상 확인
		
		TreeSet<Lottery> sortedList = lc.sortedWinObject();
		if(sortedList.isEmpty()) {
			System.out.println("당첨 결과가 없습니다.");
		} else {
			Iterator<Lottery> iterator = sortedList.iterator();
			while(iterator.hasNext()) {
				Lottery l = iterator.next();
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}
	
	public void searchWinner() { // 5. 당첨 대상 검색용 view 메소드
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("핸드폰 번호('-' 빼고) : ");
		String phone = sc.next();
		
		Lottery l = new Lottery(name, phone);
		if(lc.searchWinner(l)) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		} else {
			System.out.println("안타깝지만 당첨 목록에 없습니다.");
		}
		
	}
	
	
}



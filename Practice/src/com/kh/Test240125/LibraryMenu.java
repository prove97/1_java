package com.kh.Test240125;

import java.util.Scanner;

public class LibraryMenu {
	Scanner sc = new Scanner(System.in);
	private LibraryController lc = new LibraryController();
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().toLowerCase().charAt(0); //toLowerCase() : 소문자로 바꿔줌
		
		lc.insertMember(new Member(name, age, gender));
		
		int selectMenu = 0;
		
		while(true) { //무한반복
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지"); // LibraryController의 myInfo() 호출하여 출력
			System.out.println("2. 도서 전체 조회"); // LibraryMenu의 selectAll() 호출
			System.out.println("3. 도서 검색"); // LibraryMenu의 searchBook() 호출
			System.out.println("4. 도서 대여하기"); // LibraryMenu의 rentBook() 호출
			System.out.println("9. 프로그램 종료하기");
			
			System.out.print("메뉴 번호 : ");
			selectMenu = sc.nextInt();
			
			switch(selectMenu) {
			case 1:
				System.out.println(lc.myInfo());
				break;
			case 2:
				this.selectAll();
				break;
			case 3:
				this.searchBook();
				break;
			case 4:
				this.rentBook();
				break;
			case 9:
				System.out.println("종료합니다");
				sc.close();
				return;
			default:
				System.out.println("잘못입력ㄱ하셨습니다.");
			}
		}
	}
	
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		for(int i = 0; i < bList.length; i++) {
			if(bList[i] != null) {
				System.out.print(i + "번도서 : " + bList[i].toString() +"\n");
			}
		}
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.next();
		Book[] searchBList = null;
		searchBList = lc.searchBook(keyword);

		if(searchBList[0] == null) {
			System.out.println("일치하는 도서가 존재하지 않습니다.");
			return;
		}
		
		for(int i = 0 ; searchBList[i] != null; i++) {
			System.out.println(i + "번도서 : " + searchBList[i].toString());
		}
		
	}
	
	public void rentBook() {
		this.selectAll();
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		switch(result) {
		case 0:
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:
			System.out.println("나이 제한으로 대여 불가능합니다.");
			break;
		case 2:
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
			break;
		}			
			
	}

}

package com.kh.Test240123_2;

import java.util.Scanner;

public class Library {
	// 도서관리 프로그램
	Book[] bookArr;
	Scanner sc = new Scanner(System.in);
	
	String title;
	String author; 
	String date;
	int bookNumber;
	
	public Library() {
		this.bookArr = new Book[100]; // bookArr는 Book참조변수 100개를 가지고있는 배열
	}
	
	public void startLibrary() {
		int choice = 0;
		
		while(true) {
			System.out.println("==========도서관리 프로그램==========");
			System.out.println("1. 도서등록");
			System.out.println("2. 모든 도서 출력");
			System.out.println("9. 종료");
			System.out.print("메뉴 입력 : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: // 도서등록
				this.insertBook();
				break;
			case 2: // 모든 도서 출력
				this.allPrintBook();
				break;
			case 9:
				System.out.println("종료합니다");
				return;
				
			
			}
		}
				
	}
	
	public void insertBook() {
		System.out.println("==========도서 등록==========");

		System.out.print("제목 : ");
		title = sc.next();

		System.out.print("작가 : ");
		author = sc.next();
		
		System.out.print("발행일: ");
		date = sc.next();
		
		System.out.print("책 번호 : ");
		bookNumber = sc.nextInt();

		// 제목이 똑같은 책이 있다면 생성하지 말고 "이미 등록된 도서입니다." 출력후 넘어가기
		boolean isEquals = false;
		
		int index = 0; // bookArr을 0부터 끝까지 탐색하기 위한 index
		while(bookArr[index] != null) { // bookArr[index] == null -> bookArr[i]가 가르키는 메모리가 존재하지 않는다(객체생성이 되어있지 않다)
			if(bookArr[index].getTitle().equals(title)) {
				System.out.println("이미 등록된 도서입니다.");
				isEquals = true; // 중복을 찾았다는 정보 저장
				break;
			}
			index++; // 다음 인덱스 값을 검사하기 위해 index값이 1증가
		}
		System.out.println(isEquals+""+!isEquals);
		
		if(isEquals == true) { // 중복이 없다면 객체 추가생성
			bookArr[index] = new Book(title, author, date, bookNumber);
			return;
		}
		
		System.out.println("도서 등록 완료!");
	}
	
	public void allPrintBook() {
		for(int i = 0; i < bookArr.length; i++) {
			if(bookArr[i] == null) {
				break;
			}
			System.out.println(bookArr[i].toString());
		}
	}
}

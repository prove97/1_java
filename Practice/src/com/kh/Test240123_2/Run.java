package com.kh.Test240123_2;

public class Run {
/*
 * 자바는 모두 class로 이루어져있다.
 * Run Class를 만들어서 main문을 실행하는 용도로 사용하는 이유
 * 
 * main -> 컴파일러에게 시작위치를 알려주는 역할을 하는 메소드
 */
	public static void main(String[] args) {
//		//	myBook.title = "불멸의 이순신" // Book 클래스의 필드 값이 private이기 때문에 접근 못함
//		Book myBook1 = new Book("불멸의 이순신", "김개똥", "2022-02-24", 1);
//		Book myBook2 = new Book("홍길동전", "허균", "2022-01-14", 2);
//		
//		Book[] myBookArr = new Book[10]; // 객체(참조 변수)를 여러개 만듦
//		myBookArr[0] = new Book("불멸의 이순신", "김개똥", "2022-02-24", 1);
//		myBookArr[1] = myBookArr[0];
		
//		System.out.println(myBookArr[0] +" "+ myBookArr[1]); 
		
		Library lib = new Library();
		lib.startLibrary();
		
	}

}

package com.kh.Test240122;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

//		// 정수 n(2~9)을 입력받아 2부터 n까지 중 짝수의 구구단을 출력하는 함수를 작성하세요.
//		// 만약 2~9사이의 값을 입력받지 못했다면 "다시 입력하세요"를 반복합니다.
//		int n;
////		System.out.print("n의 값을 입력하세요: ");
////		n = sc.nextInt();	
////		while(true) {
////			if(n < 2 || n > 9) {
////				System.out.println("다시 입력하세요.");
////				n = sc.nextInt();
////			} else break;
////		}
//		
//		do {
//			System.out.print("정수 입력 : ");
//			n = sc.nextInt();
//			if(n < 2 || n > 9) {
//				System.out.println("다시 입력하세요.");
//				continue;
//			}
//		} while(n < 2 || n > 9);
//		
//		for(int i = 2; i <= n; i+=2) {
//			System.out.println("=====" + i + "단 ======");
//			for(int j = 1; j <= 9; j++) {
//				System.out.printf("%d X %d = %d\n", i, j, i*j);
//			}
//		}
		
		
//		// 정수 num을 입력받아 크기가 num인 정수형 배열을 만들고 1~100사이의 랜덤값으로 모든 배열의 값을 대입합니다.
//		// 이후 모든 배열의 홀수인덱스의 값을 더한 값을 구하세요.
//		int num;
//		System.out.print("정수 입력 : ");
//		num = sc.nextInt();
//		int[] iArr = new int[num];
//		
//		int sum = 0;
//		for(int i = 0; i < num; i++) {
//			iArr[i] = (int)(Math.random()*100 + 1);
//			if(i % 2 == 1) {
//				System.out.printf("iArr[%d] = %d\n", i, iArr[i]);
//				sum += iArr[i];
//			}
//		}
//		System.out.println(sum);
		
		
		
//		// 다음과 같은 코드를 실행했을 때 예시와 같은 결과가 출력되도록 TV클래스를 작성하세요.
//		// TV myTV = new TV("삼성", 2020, 65);
//		// myTV.show();
//		// => 삼성에서 만든 2020년형 65인치 TV
//		
//		
//		 TV myTV = new TV("삼성", 2020, 65, 100000);
//		 myTV.show();
//		 TV myTV2 = new TV("LG", 2024, 85, 200000);
//		 myTV2.show();
//		
//		 
//		 // one 이라는 Human객체를 생성하고
//		 // 해당 객체로 myTV와 myTV2구매가 가능한지 확인
//		 Human one = new Human("이원기", 110000);
//		 one.buy(myTV);
		 
//		 Human lee = new Human("이원기", 15000);
//		 System.out.println(lee.cnt);
//		 Human kim = new Human("김지원", 14000);
//		 System.out.println(kim.cnt);
//		 
//		 System.out.println(Human.cnt);
//		 // 동적변수와 구분하기 위해 class 이름으로 접근
//		 // 동적변수는 객체
		
		/*
		 * 우리는 도서관에서 책을 관리하는 프로그램을 만든다고 가정한다.
		 * 해당 클래스는 도서관에 책을 등록할 때 사용하는 book 객체를 생성할 Book 클래스이다.
		 * 필요하다고 생각하는 데이터와 기능을 구현해보자.
		 * 
		 * Book book1 = new Book(초기화변수);
		 * 
		 * 사용자로부터 제목, 장르, 저자, 책번호를 입력받아
		 * book객체를 생성하고 생성된 객체의 toString 메소드를 호출하여 정보를 확인해주세요.
		 */
		
		Book[] bookArr = new Book[100];
		
		//String title, genre, author;
		int number, cnt = 0;
		int menu = 0;
		boolean tobeContinue = true;
		
		while(menu != 9) {
			System.out.println("===========도서관리프로그램===========");
			System.out.println("1. 도서등록");
			System.out.println("2. 도서목록출력");
			System.out.println("3. 도서검색");
			System.out.println("9. 종료");
			System.out.println("메뉴 선택()");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:{
				while(tobeContinue){
					String title, genre, author;
					System.out.print("도서 제목 : ");
					title = sc.next();
					
					System.out.print("장르 : ");
					genre = sc.next();
					
					System.out.print("저자 : ");
					author = sc.next();
					
					System.out.print("책 번호 : ");
					number = sc.nextInt();
					
//					Book newBook = new Book(title, genre, author, number);
//					System.out.println("도서 등록 완료 : " + newBook.toString());
					
					bookArr[cnt] = new Book(title, genre, author, number);
					System.out.println("도서 등록 완료 : " + bookArr[cnt++].toString());
					
					System.out.print("계속 등록하시겠습니까?(y/n) : ");
					tobeContinue = sc.next().toLowerCase().charAt(0) == 'y' ? true : false;
				}
			} break;
			case 2:
				System.out.println("============등록된 도서정보============");
				if(bookArr[0] == null) {
					System.out.println("등록된 도서 정보가 없습니다.");
					break;
				}
				for(int i = 0; i < bookArr.length && bookArr[i] != null; i++){
					//혹은 if(bookArr[i] == null) {System.out.println(bookArr[i].toString());}
					System.out.println(bookArr[i].toString());
				}
				break;
			case 3:{
				System.out.println("============도서 검색============");
				System.out.print("검색할 도서 제목 : ");
				String title = sc.next();
				Book target = null;
				
				for(int i = 0; i < bookArr.length; i++){
					if(bookArr[i] == null) { // 객체 배열에 더이상 값이 없을때 반복문 종료
						break;
					} else if(bookArr[i].getTitle().equals(title)) { // 찾으려는(입력받은) 도서이름이 일치한다면 
						target = bookArr[i]; // 만약 찾았다면 target => null 아님
						break;
					} else // 객체 배열에 값이 있지만 찾으려는(입력받은) 도서이름이 일치하지 않는 경우, 계속 반복문 실행 
						continue;
				}
				if (target == null) {
					System.out.println("동일한 제목의 도서가 없습니다.");
				} else {
					System.out.println("검색 도서 정보 : " + target.toString());
				}
			} break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			
			
		}
		
		// 배열 bookArr에 등록된 모든 도서정보 출력
		// ============등록된 도서정보============
		//Book[title=s genre=d author=d number=4]
		
		
	}
}

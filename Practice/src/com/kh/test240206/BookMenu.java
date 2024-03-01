package com.kh.test240206;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookMenu {
	private Scanner sc= new Scanner(System.in); // BookController 객체 생성
	private BookController bc = new BookController(); // Scanner 객체
	private Map<Integer, String> map = new HashMap<>();

	public void mainMenu() {
		System.out.println("== Welcome KH Library ==");
		int select = 0;
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 새 도서 추가"); // insertBook () 실행
			System.out.println("2. 도서 전체 조회"); // selectList()
			System.out.println("3. 도서 검색 조회"); // searchBook()
			System.out.println("4. 도서 삭제"); // deleteBook()
			System.out.println("5. 도서 명 오름차순 정렬"); // ascBook()
			System.out.println("9. 종료"); // "프로그램을 종료합니다." 출력 후 main()으로 리턴
			System.out.print("메뉴 번호 선택 : ");
			select = sc.nextInt();
			
			// 메뉴 화면 반복 실행 처리
			// 잘못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
			
			switch (select){
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				break;
			}
		}
		
	}
	
	public void insertBook() {
		map.put(1, "인문");
		map.put(2, "자연과학");
		map.put(3, "의료");
		map.put(4, "기타");
		
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서 명 : ");
		sc.nextLine();
		String title = sc.nextLine();

		System.out.print("저자 명 : ");
		sc.nextLine();
		String author = sc.next();
		
		System.out.print("장르(1. 인문/ 2. 과학/ 3. 외국어/ 4. 기타) : ");
		int categoryNum = sc.nextInt();
		sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		bc.insertBook(new Book(title, author, map.get(categoryNum), price));
		
		System.out.println();

	}
	
	public void selectList() {
		ArrayList<Book> bArr = bc.selectList();
		if(bArr.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
			return;
		}
		System.out.println("===== 도서 전체 조회 =====");
		for(Book b : bArr) {
			System.out.println(b);
		}
		System.out.println();
	}
	
	public void searchBook() {
		System.out.print("검색 키워드 : ");
		String keyword = sc.next();
		ArrayList<Book> searchBook = bc.searchBook(keyword);

		for(Book b : searchBook) {
			System.out.println(b);
		}
		System.out.println();
	}
	
	public void deleteBook() {
		System.out.println("===== 도서 삭제 =====");
		System.out.print("삭제할 도서명 : ");
		String title = sc.next();
		sc.nextLine();
		System.out.print("삭제할 저자명 : ");
		String author = sc.next();
		sc.nextLine();
		
		Book removeBook = bc.deleteBook(title, author);
		if(removeBook != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else 
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		System.out.println();

	}
	
	public void ascBook() {
		int result = bc.ascBook();
		if(result == 1) {
			System.out.println("정렬에 성공하였습니다.");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
		System.out.println();
			
	}
}

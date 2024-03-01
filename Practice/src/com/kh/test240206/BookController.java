package com.kh.test240206;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookController {
	List<Book> bookList = new ArrayList<>(); // ArrayList 객체 생성

	public BookController() {
		super();
		// 초기 값 4개 추가
		bookList.add(new Book("자바의 정석", "남궁성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	
	public void insertBook(Book bk) {
			this.bookList.add(bk); //전달 받은 bk를 bookList에 추가
	}
	
	public ArrayList selectList() {
		 // 해당 bookList의 주소 값 반환
		return (ArrayList)bookList;
	}

	public ArrayList searchBook(String keyword) {
		// 검색 결과 리스트를 담아줄 리스트(ArrayList searchList) 선언 및 생성
		ArrayList<Book> searchList = new ArrayList();
		
		// 반복문을 통해 list의 책 중 책 명에 전달 받은 keyword가 포함되어있는 경우
		// searchList에 해당 책 추가하고 searchList 반환
		for(Book b : bookList) {
			if(b.getTitle().contains(keyword) ||
					b.getAuthor().contains(keyword)) {
				searchList.add(b);
			}
		}
//		for(Object obj : bookList) {
//			if(obj instanceof Book) {
//				Book book = (Book)obj;
//				
//				if(book.getTitle().contains(keyword) ||
//						book.getAuthor().contains(keyword)) {
//					searchList.add(book);
//				}
//			}
//		}
		if(searchList.isEmpty()) { // 일치하는 도서가 없을 경우
			System.out.println("일치하는 도서가 없습니다.");
			return null;
		}
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		// 삭제된 도서를 담을 Book객체 (Book removeBook) 선언 및 null로 초기화
		Book removeBook = null;
		
		// 반복문을 통해 bookList의 책 중 책 명이 전달 받은 title과 동일하고
		// 저자 명이 전달 받은 author와 동일한 경우 해당 인덱스 도서 삭제 후 빠져나감
		for(Book b : bookList) {
			if(b.getTitle().contains(title) &&
					b.getAuthor().contains(author)) {
				removeBook = b;
				bookList.remove(removeBook);
				break;
			}
		}
//		for(Object obj : bookList) {
//			if(obj instanceof Book) {
//				Book book = (Book)obj;
//				if(book.getTitle().contains(title) &&
//						book.getAuthor().contains(author)) {
//					removeBook = book;
//					bookList.remove(removeBook);
//					break;
//				}
//			}
//		}
		
		// 이 때 해당 인덱스 도서를 removeBook에 대입 후 removeBook 반환
		return removeBook;
	}
	
	/*
	 * 문자열.compareTo => 두 문자열이 동일한 경우 : 0
	 *                   사전적으로 먼저 위치한 문자열이 앞에 있을 경우 : 음수
	 *                   사전적으로 먼저 위치한 문자열이 뒤에 있을 경우 : 양수
	 */
	public int ascBook() {
		// 책 이름으로 오름차순 후 1 반환

		try {
			this.bookList.sort((obj1, obj2) -> ((Book)obj1).getTitle().compareTo(((Book)obj2).getTitle())); //아래 주석 축약버전(람다식)
			return 1;
		} catch(Exception e) {
			return 0;
		}
		
//		this.bookList.sort(new Comparator<Book>() { 
//			@Override
//			public int compare(Book obj1, Book obj2) {
//				return obj1.getTitle().compareTo(obj2.getTitle());
//			}
//		});
		
	}
	
	
}

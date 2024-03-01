package com.kh.Test240123_2;

public class Book {
	//필드 -> private으로 한다(외부의 접근을 차단)
	
	private String title;
	private String author; 
	private String date;
	private int bookNumber;
	
	// 생성자
	public Book() { // 기본생성자: 아무 생성자도 만들어주지 않으면 자동으로 생김
	}
	
	public Book(String title, String author, String date, int bookNumber) {
		super(); // 자바의 모든 클래스들은 Object 클래스를 상속받는다
		this.title = title;
		this.author = author;
		this.date = date;
		this.bookNumber = bookNumber;
	}

	// private으로 선언된 필드에 접근하기 위해 getter/setter 메소드 사용
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", date=" + date + ", bookNumber=" + bookNumber + "]";
	}
	
	
	
}

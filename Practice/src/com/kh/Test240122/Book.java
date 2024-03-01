package com.kh.Test240122;

public class Book {
	private String title; // 책이름 // shift + alt + s -> r : getter, setter 메소드 자동 생성
	private String genre; // 책 장르 
	private String author; // 저자
	private int number; //책번호

	
	public Book(String title, String genre, String author, int number) {// shift + alt + s -> o : 생성자 자동생성 
		super();
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.number = number;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + " genre=" + genre + " author=" + author + " number=" + number+"]";
	}
}

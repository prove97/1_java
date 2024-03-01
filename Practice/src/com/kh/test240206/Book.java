package com.kh.test240206;

import java.util.Objects;

public class Book {
	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() {
		super();
	}

	public Book(String title, String author, String category, int price) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

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

	public String getcategory() {
		return category;
	}

	public void setcategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "(" + title + "/" + author + "/" + category + "/" + price + ")";
	}

	@Override
	public int hashCode() {
		String str = this.title + this.author + this.category + this.price;
		return str.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		boolean isEquals = false;
		if(obj instanceof Book) {
			Book tmp = (Book)obj;
			if(this.getTitle().equals(tmp.getTitle()) &&
					this.getAuthor().equals(tmp.getAuthor()) &&
					this.getcategory().equals(tmp.getcategory()) &&
					this.getPrice() == tmp.getPrice()) {
				isEquals = true;
			}
		}
		return isEquals;
	}
	
	public int compareTo(Object o) {
		return 1;
	}
	
	
	
	
	
}

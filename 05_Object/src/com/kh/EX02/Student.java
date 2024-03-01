package com.kh.EX02;
/*
 * 이름 나이 수학점수 영어점수 국어점수를 데이터로 가지고 있는 객체를 만들기 위한 클래스르 작성해라
 * 데이터는 직접 접근을 허용하지 않고 모두 간접적으로 set/get 해줄 수 있도록 작성해라
 * 모든 데이터를 매개변수로 받아 초기화하면서 객체를 생성할 수 있는 생성자를 작성
 */
public class Student {
	// 필드영역(데이터)
	private String name;
	private int age;
	private int ma_score;
	private int en_score;
	private int ko_score;
	private int average;
	
	// 생성자 영역
	public Student(String name, int age, int ma_score, int en_score, int ko_score) {
		this.name = name;
		this.age = age;
		this.ma_score = ma_score;
		this.en_score = en_score;
		this.ko_score = ko_score;
	}
	public Student() {}
	
	// 메소드 영역
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public int getMathScore() {
		return this.ma_score;
	}
	public int getEnglishScore() {
		return this.en_score;
	}
	public int getKoreanScore() {
		return this.ko_score;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMathScore(int ma_score) {
		this.ma_score = ma_score;
	}
	public void setEnglishScore(int en_score) {
		this.en_score = en_score;
	}
	public void setKoreanScore(int ko_score) {
		this.ko_score = ko_score;
	}
	
	public int getAverage() {
		average = (this.en_score + this.ko_score + this.ma_score)/3;
		return average;
	}
}

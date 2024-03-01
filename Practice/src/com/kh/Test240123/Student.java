package com.kh.Test240123;

public class Student {
	private String name;
	private int ma;
	private int ko;
	private int eng;
	
	public Student(String name, int ko, int ma, int eng) {
		super();
		this.name = name;
		this.ma = ma;
		this.ko = ko;
		this.eng = eng;
	}


	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMa() {
		return ma;
	}
	
	public void setMa(int ma) {
		this.ma = ma;
	}

	public int getKo() {
		return ko;
	}
	
	public void setKo(int ko) {
		this.ko = ko;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public float getAvg() {
			return (this.ma+this.ko+this.eng)/3.0f;
	}
	
	public String toString() {
		return "이름 : " + this.name + ", 수학 : " + this.ma+ ", 국어 : " + this.ko + ", 영어 : "
				+ this.eng + ", 평균 : " + getAvg();  
	}
	
	
	
	
}

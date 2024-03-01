package com.kh.EX02;

// 이름(name), 평균 합격컷(evgCut), 국어 최저점수(koCut), 영어 최저점수(enCut)
// 모든 데이터를 매개변수로 받아 초기화하는 생성자 정의
public class University {
	
	private String name;
	private int avgCut;
	private int koCut;
	private int enCut;
	
	public University(String name, int avgCut, int koCut, int enCut) {
		//this(name, avgCut, koCut, enCut);
		this.name = name;
		this.avgCut = avgCut;
		this.koCut = koCut;
		this.enCut = enCut;
	}
	
	public String getName(){
		return this.name;
	}
	public int getAvgCut(){
		return this.avgCut;
	}
	public int getKoCut(){
		return this.koCut;
	}
	public int getEnCut(){
		return this.enCut;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAvgCut(int avgCut){
		this.avgCut = avgCut;
	}
	public void setKoCut(int koCut){
		this.koCut = koCut;
	}
	public void setEnCut(int enCut){
		this.enCut = enCut;
	}
	
	// 합격이라면 true / 불합격이면 false 리턴
	public boolean isEvaluate(Student st) {
		if(st.getAverage() >= this.getAvgCut() &&
				st.getEnglishScore() >= this.getEnCut() &&
				st.getKoreanScore() >= this.getKoCut()) {
			return true;
		} else
			return false;
	}
	
	
}

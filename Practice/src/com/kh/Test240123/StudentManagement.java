package com.kh.Test240123;

import java.util.Scanner;

public class StudentManagement { //학생관리 프로그램
	Scanner sc; 
	Student[] stdArr; // 학생목록

	public StudentManagement() {
		super();
		this.stdArr = new Student[100];
	}
	public StudentManagement(Student[] stArr) {
		super();
		this.stdArr = stArr;
	}
	
	public void startProgram() {
		int select = 0;
		while(select != 9) {
			select = printMenu();

			switch(select) {
			case 1: //성적입력
				this.insertGrade();
				break;
			case 2: // 모든 학생 성적확인
				this.printAllStudent();
				break;
			case 3: // 이름으로 학생 검색 후 정보 출력
				this.searchGradeByName();
				break;
			case 4: // 마지막으로 저장된 정보 삭제
				this.lastGradeDelete();
				break;
			case 5: // 선택한 조건 검색
				this.searchGradeByCondition();
				break;
			case 9:
				System.out.println("종료합니다");
				return;
			}
		}
		sc.close();
		
	}
	
	public int printMenu() {
		System.out.println("==============성적관리 프로그램==============");
		System.out.println("1. 성적입력");
		System.out.println("2. 모든 학생 성적확인");
		System.out.println("3. 학생 성적 검색");
		System.out.println("4. 마지막 저장 정보 삭제");
		System.out.println("5. 조건검색");
		System.out.println("9. 종료");
		System.out.print("메뉴를 입력하세요 : ");
		int select = sc.nextInt();
		sc.nextLine();
		return select;
	}
	
	public void insertGrade() {
		Student[] stdArr = new Student[100];
		String name;
		int ma, ko, eng;
		
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("수학점수 : ");
		ma = sc.nextInt();
		System.out.print("국어점수 : ");
		ko = sc.nextInt();
		System.out.print("영어점수 : ");
		eng = sc.nextInt();
		
		int i = 0;
		boolean isTrue = false;
		while(stdArr[i] != null) {
			if(stdArr[i++].getName().equals(name)) {
				System.out.println("해당이름으로 저장된 성적이 존재합니다.");
				isTrue = true;
				break;
			}
		}
		
		if(!isTrue) {
			stdArr[i] = new Student(name, ma, ko, eng);
			System.out.println("성적 저장 완료 : " + stdArr[i].toString());
		}
	}

	public void printAllStudent() {
		for(int i = 0; i < stdArr.length; i++) {
			if(stdArr[i] != null) {
				System.out.println(stdArr[i].toString());
				continue;
			} else {
				System.out.println("현재 입력된 정보가 없습니다");
				break;
			}
		}
	}

	public void searchGradeByName() {
		if(stdArr[0] == null){
			System.out.println("현재 입력된 정보가 없습니다");
			return;
		} else {
			System.out.print("이름을 입력해주세요 : ");
			String target = sc.next();
			
			for(int j = 0; j < stdArr.length; j++) {
				if(target.equals(stdArr[j].getName())) {
					System.out.println(stdArr[j].toString());;
					break;
				} else continue;
			}
			System.out.println("일치하는 정보가 없습니다");
		}
	}
	
	public void searchGradeByCondition() {
		// 1. 평균, 2. 수학, 3. 국어, 4. 영어
		// (다른번호 입력시 잘못입력하셨습니다. 출력하고 성적관리 프로그램으로 돌아가기)
		// 조회할 조건 입력 : 1
		// 기준 점수(이상) : 50
		// 기존 점수(이하) : 30
		
		// 50이상 30이하의 평균 학생
		
		System.out.println("==============성적관리 프로그램==============");
		System.out.println("1. 평균, 2. 수학, 3. 국어, 4. 영어");
		System.out.print("조회할 조건 입력 : ");
		int select= sc.nextInt();
		
		
		System.out.print("기준점수(이상) : ");
		int min = sc.nextInt(); 
		System.out.print("기준점수(이하) : ");
		int max = sc.nextInt();
		
		switch(select) {
		case 1:
			for(int i = 0; stdArr[i] != null; i++) { // 생성된 것까지만 배열을 반복해서 탐색
				double avg = stdArr[i].getAvg();
				if(min<=avg && max >= avg) {
					System.out.println(stdArr[i].toString());
				}
			}
		case 2:
		case 3:
		case 4:
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
	}
	
	public void lastGradeDelete() {
		if(stdArr[0] == null) {
			System.out.println("학제할 성적이 없습니다.");
			return;
		}
		for(int i = 0; i< stdArr.length; i++) {
			if(stdArr[i] == null) {
				System.out.print("삭제정보 : " + stdArr[i-1].toString());
				stdArr[i-1] = null;
				System.out.println("삭제 완료");
				return;
			}
		}
	}
	
	

}
package com.kh.Test240123;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int ma, ko, eng;
		
//		// 사용자로부터 이름/수학점수/국어점수/영어점수를 입력받아 
//		// 평균을 실수로 구하세요.
//		System.out.print("이름 : ");
//		name = scan.next();
//		System.out.print("수학점수 : ");
//		ma = scan.nextInt();
//		System.out.print("국어점수 : ");
//		ko = scan.nextInt();
//		System.out.print("영어점수 : ");
//		eng = scan.nextInt();
//
//		System.out.println("평균 : " + (ma + ko + eng)/3.0);
		
		
//		// 위에서 입력받은 정보로 객체를 생성할 수 있는 Student클래스를 작성하세요.
//		// 평균을 구하는 메소드, 모든 필드정보를 보여주는 메소드를 포함하여 작성합니다. 
//		Student lee = new Student(name, ma, ko, eng);
//		
//		lee.toString();
		
		
//		// 반복문을 통해 해당프로그램을 작성합니다.
//		// ==============성적관리 프로그램==============
//		// 1. 성적입력
//		// 2. 모든학생 성적확인
//		// 3. 학생성적검색
//		// 9. 종료
//		// 메뉴를 입력하세요 : 1
//		// -> 1번 입력시 이름 수학/국어/영어점수를 입력받아 객체배열에 저장(이름 중복 안되도록)
//		// -> 2번 입력시 객체배열에 저장된 모든 객체정보 표시
//		// -> 3번 입력시 이름을 입력받아 해당 이름의 학생 검색 후 정보 출력
//		// -> 9번 입력시 종료
//		
//		int menu = 0;
//		Student[] stdArr = new Student[100];
//		int cnt = 0;
//		
//		while(menu != 9) {
//			System.out.println("==============성적관리 프로그램==============");
//			System.out.println("1. 성적입력");
//			System.out.println("2. 모든 학생 성적확인");
//			System.out.println("3. 학생 성적 검색");
//			System.out.println("9. 종료");
//			System.out.print("메뉴를 입력하세요 : ");
//			menu = scan.nextInt();
//			
//			switch (menu) {
//				case 1:
//					System.out.print("이름 : ");
//					name = scan.next();
//					System.out.print("수학점수 : ");
//					ma = scan.nextInt();
//					System.out.print("국어점수 : ");
//					ko = scan.nextInt();
//					System.out.print("영어점수 : ");
//					eng = scan.nextInt();
//					
//					int i = 0;
//					boolean isTrue = false;
//					while(stdArr[i] != null) {
//						if(stdArr[i].getName().equals(name)) {
//							System.out.println("해당이름으로 저장된 성적이 존재합니다.");
//							isTrue = true;
//							break;
//						}
//					}
//					
//					if(!isTrue) {
//						stdArr[cnt] = new Student(name, ma, ko, eng);
//						cnt++;
//					}
//					
//					
//					break;
//					//for(;;){} //이름 중복 확인
//					
//				case 2:
//					for(int j = 0; j < stdArr.length; j++) {
//						if(stdArr[j] != null) {
//							System.out.println(stdArr[j].toString());
//							continue;
//						} else {
//							System.out.println("현재 입력된 정보가 없습니다");
//							break;
//						}
//					}
//					break;
//				case 3:
//					if(stdArr[0] == null){
//						System.out.println("현재 입력된 정보가 없습니다");
//						break;
//					} else {
//						System.out.print("이름을 입력해주세요 : ");
//						String target = scan.next();
//						
//						for(int j = 0; j < stdArr.length; j++) {
//							if(target.equals(stdArr[j].getName())) {
//								System.out.println(stdArr[j].toString());;
//								break;
//							} else continue;
//						}
//						System.out.println("일치하는 정보가 없습니다");
//					}
//					
//					break;
//					
//					
//				case 9:
//					System.out.println("종료합니다");
//					break;
//			}
//			
//			
//		}
		
		
		StudentManagement st = new StudentManagement();
		st.startProgram();
		
		//오류남, 나중에 수정
		
	}

}

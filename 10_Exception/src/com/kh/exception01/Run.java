package com.kh.exception01;

import java.io.IOException;
import java.util.Scanner;

public class Run {
	
	/*
	 * * 에러 종류
	 * - 시스템 에러 : 컴퓨터의 오작동으로 발생하는 오류 -> 소스코드로 해결이 안됨 ->심각한 오류
	 * - 컴파일 에러 : 소스코드 문법상의 오류 -> 빨간줄로 오류를 알려준다.(개발자의 실수) -> 발견과 해결이 쉽다.
	 * - 런타임 에러 : 코드 상으로는 문제가 없는데 프로그램 실행 중에 발생하는 오류(사용자의 실수일 수 있고 개발자가 예측 가능하지만 처리를 안해놓은 오류) 
	 * - 논리 에러  : 문법적으로도 문제없고 실행 했을 때도 문제는 없지만 프로그램 의도와 맞지않는 동작이나 결과가 나타나는 오류
	 * 
	 * 컴파일에러, 런타임에러, 논리에러 같은 개발자가 예측하여 수정할 수 있는 에러들을 가지고 작업
	 * => 이런것들을 "예외"라고 함 => Exception
	 * 
	 * 이런 "예외"가 "발생"했을 경우에 대해서 "처리"하는 방법을 "예외처리"라고 함!
	 * 
	 * * 예외처리를 하는 목적
	 * - 예외처리를 하지 않고 예외가 발생되는 경우 프로그램이 비정상적으로 종료될 수 있음
	 * 
	 * * 예외처리하는 방법
	 * 1. try~catch문을 이용
	 * 2. throws를 이용(떠넘기기 == 위임한다)
	 */
	
	public static void main(String[] args) throws IOException { 
		RunException ex = new RunException();
//		re.method01();
//		new RunException().method01();
		
//		new RunException().method02();
		
//		new RunException().method03();
		
		
//		try { // 오류가 안났을 때 실행
//			ex.method04(); 
//		} catch(IOException e) { // 오류가 났을 때 실행
//			e.printStackTrace(); 
//		} 

//		Scanner sc = new Scanner(System.in);
//		try {
//			int num = sc.nextInt();
//		} catch(ArithmeticException e) {
//			e.printStackTrace();
//		} finally { // try-catch의 결과와 상관없이 try-catch의 모든 과정이 끝났을 때 무조건 실행하는 구문
//			sc.close(); 
//		}
		
		// try-with-resources구문
		try(Scanner sc = new Scanner(System.in)){ // sc.close();를 안해줘도 자동으로 사라진다.
			sc.next(); 
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}

}

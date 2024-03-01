package com.kh.test240213;

import java.util.Random;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		// 홀수 짝수 출력하기
		// 랜덤으로 숫자 5개 입력받아 출력하기
//		for(int i = 0; i < 5; i++) {
//			System.out.println(rand.nextInt(100) + 1);
//		}

		// 랜덤으로 숫자 10개 입력받아 짝수만 출력하기
//		int num;
//		for(int i = 0; i < 10; i++) {
//			num = rand.nextInt(100) + 1;
//			if(num % 2 == 0) {
//				System.out.println(num);
//			} else System.out.println("("+num+")");
//		}
		
		// 문자열 입력받아서 문자열 한글자씩 출력하기
//		String str = sc.next();
//		for(int i = 0; i < str.length(); i++) {
//			System.out.println(str.charAt(i)); 
//		}
		
		// 문자열 입력받아서 문자열 첫글자 대문자로 변경하기
		String str = sc.next();
		String s = "";
		for(int i = 0; i < str.length(); i++) {
			if(i == 0)
				s += str.toUpperCase().charAt(0);
			else
				s += str.charAt(i);
		}
		System.out.println(s); 

		
		// 오버로딩, 오버라이딩에 대한 문제
		// -> 상속관계에 있는 클래스 2개를 제공해주고 오버라이딩된 메소드 출력 시 어떤 결과가 출력되는지
		// -> 클래스 하나 주어진 상태에서 해당 클래스를 상속받는 새로운 클래스를 만들고 다음과 같은 결과가 되도록 오버라이딩을 해라.
		// -> 똑같은 이름의 메소드 한 10개 제공해주고 에러가 발생하는 이유를 기술해라.
		// -> void sample(int n); -> sample(3); sample(5, 7.0); 해당 코드가 문제가 되지 안도록 코드를 수정해라.
		
		// 배열 -> 길이가 정해져있는 것 -> 배열의 범위를 초과하는 코드 조심
		// 배열을 제공해주고 모든 객체를 출력해라.
		
		// 다형성 -> 다운캐스팅 조심
		
		// Human을 담을 수 있는 ArrayList 한 개를 생성하고 임의로 Human객체 5개를 생성해서 담아라.
		// 단, 해당 List에는 Human 객체만 담을 수 있게 구성하세요. -> 제네릭 사용
		
		// ArrayList<Human> arr = new ArrayList<>();
		// arr.add(new Human("최지원");
		// arr.add("김수민");
		
		// 파일에 내용작성하기, 파일로부터 내용 가져오기
		// 파일에 객체정보 저장하기(직렬화), 파일로부터 객체정보 가져오기(역직렬화)
		
		// udp 또는 tcp에서 클라이언트, 서버 구성하기		
		
		
	}

}

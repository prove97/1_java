package com.kh.Test240126_2;

import java.util.Scanner;

public class AnimalManager {
	/*
	 * 추상클래스
	 * - 미완성된 클래스
	 * - 객체생성이 불가(단, 레퍼런스 변수(참조변수) 선언 가능)
	 * - 일반필드 + 일반메소드 [+ 추상메소드]
	 * -> 추상메소드를 가진 클래스는 반드시 추상클래스로 명시해야 함
	 * 
	 * 추상메소드가 굳이 없어도 추상클래스를 사용할 수 있을까? O
	 * >> 개념적 : 단지 '이 클래스가 미완성된 클래스'다 라는 걸 알리기 위해서
	 * >> 프로그래밍적 : 객체 생성이 불가하게끔 하고자 할때
	 * 
	 * 추상메소드가 있는 추상클래스를 사용하는 이유
	 * - 부모클래스에 추상메소드가 존재할 경우 자식클래스에서는 강제로 오버라이딩해서 동일한 패턴의 메소드를 가지게 된다.
	 *   -> 각 자식 클래스마다 실행시킬 내용은 다르지만 동일한 형태의 메소드로 구현했으면 할 때
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal[] animals = new Animal[5];
		
//		animals[0] = new Dog("뽀삐", "포메리안", 5);
//		animals[1] = new Dog("초롱", "웰시코기", 10);
//		animals[2] = new Cat("하나", "잡종", "아시아", "흰색" );
//		animals[3] = new Dog("두리", "진돗개", 15);
//		animals[4] = new Cat("셋", "잡종", "북아메리카", "갈색" );
				
		String name, kinds, location, color;
		int weight;
		
		for(int i = 0; i < animals.length; i++) {
			int num = (int)(Math.random()*2 +1);
			if(num == 1) {
				System.out.println("강아지");
				System.out.print("이름 : ");
				name = sc.next();
				System.out.print("종류 : ");
				kinds = sc.next();
				System.out.print("몸무게 : ");
				weight = sc.nextInt();
				System.out.println();
				animals[i] = new Dog(name, kinds, weight);
			} else {
				System.out.println("고양이");
				System.out.print("이름 : ");
				name = sc.next();
				System.out.print("종류 : ");
				kinds = sc.next();
				System.out.print("서식지 : ");
				location = sc.next();
				System.out.print("색깔 : ");
				color = sc.next();
				System.out.println();
				animals[i] = new Cat(name, kinds, location, color);
			}
			
		}
		sc.close();
		
		for(Animal a : animals) {
			a.speak();
//			if(animals[i] instanceof Dog) {
//				((Dog)animals[i]).speak();
//			} else if (animals[i] instanceof Cat) {
//				((Cat)animals[i]).speak();
//			}
		}
	}

}

package com.kh.interface01;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 다형성을 활용하여 Animal 타입의 배열을 만들어보자.
		Animal[] animals = new Animal[5];
		
		for(int i = 0; i < animals.length; i++) {
			System.out.println("추가할 동물을 선택해 주세요.");
			System.out.print("1. 강아지 2. 고양이 : ");
			
			int num = sc.nextInt();
//			animals[i] = num == 1 ? new Dog() : new Cat();
			switch(num) {
			case 1:
				animals[i] = new Dog();
				break;
			case 2:
				animals[i] = new Cat();
				break;
			}
			
		}
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] instanceof Baby) {
				System.out.println("zzZZZ");
			} else {
				animals[i].makeSound();
			}
		}
	}

}

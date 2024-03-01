package com.kh.employy;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee[] emList = new Employee[100];
		/*
		 * 1. 사원추가
		 * 9. 프로그램 종료
		 * 메뉴 번호를 누르세요 : 
		 * (정수하나 입력받기)
		 */
		
		int number = 0;
		int index = 0;
		while(number != 9) {
			System.out.println("1. 사원추가");
			System.out.println("2. 사원목록");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호를 누르세요 : ");
			number = sc.nextInt();

			switch(number) {
			case 1: 
				/*
				 * 사원번호, 이름, 성별, 전화번호, 
				 * 추가 정보를 더 입력하시겠습니까?(y/n)
				 * y일때만 부서, 연봉, 보너스율 입력받고
				 * 해당 데이터를 활용하여 사원 추가
				 */
				
				System.out.print("사원번호 : ");
				int empNo = sc.nextInt();
//				emList[index].setEmpNo(sc.nextInt());
				
				System.out.print("이름 : ");
				String name = sc.next();
//				emList[index].setName(sc.next());
				
				System.out.print("성별 : ");
				char gender = sc.next().charAt(0);
//				emList[index].setGender(sc.next().charAt(0));
				
				System.out.print("전화번호 : ");
				String phone = sc.next();
//				emList[index].setPhone(sc.next());
				
				emList[index] = new Employee(empNo, name, gender, phone);
				System.out.print("더 입력하시겠습니까?(y/n) : ");
				char yesOrNo = sc.next().toLowerCase().charAt(0);
				if(yesOrNo == 'y') {
					System.out.print("부서 : ");
					emList[index].setDept(sc.next());
				
					System.out.print("연봉 : ");
					emList[index].setBonus(sc.nextInt());
					
					System.out.print("보너스율 : ");
					emList[index].setBonus(sc.nextDouble());
					
					System.out.println(emList[index]);
					index++;
					break;
				} else { // 추가정보 입력받지 않았을때
					index++;
					break;
				}
			
			case 2:
				for (int i = 0; i < emList.length; i++) {
					if(emList[i] == null)
						break;
					System.out.println(emList[i].toString());
				}
				break;
				
			case 9:
				System.out.println("종료합니다.");
				return;
			}
			
		}
		
//		// number라는 변수의 int형 값을 하나 입력받아 출력해라.
//		int number;
//		number = sc.nextInt();
//		System.out.println("number : " + number);
		
		
//		//입력받은 값 number가 100본다 작은 정수이면 "100 이하" 출력
//		// 100이면 "100" 100이상이면 "100을 초과하였습니다. 다시입력해주세요"를 출력한 후 
//		// 100이하가 입력될 때까지 반복
//		int number;
//		while(true) {
//			number = sc.nextInt();
//			System.out.println("number : " + number);
//			
//			if(number < 100) {
//				System.out.println("100 이하");
//				return;
//			} else if(number == 100) {
//				System.out.println("100");
//			} else {
//				System.out.println("100을 초과하였습니다. 다시입력해주세요.");
//			}
//		}
		
		
//		//1부터 입력받은 number까지의 값을 전부 더한 값을 구해라.
//		//ex) number = 5 -> 1+2+3+4+5 => 15출력
//		
//		int number = sc.nextInt();
//		int sum = 0;
//		for(int i = 1; i <= number; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		
//		//길이가 100인 int형 1차원배열 arr을 생성하고
//		// 1~number까지의 수를 순서대로배열에 저장하고 출력해라.
//		int[] arr = new int[100];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i+1;
//			System.out.println(arr[i]);
//		}
		
		
		
		//Employee클래스를 작성하라.
		//empNo(int) name(String) gender(char) phone(String) 
		//getter/setter 및 toString 작성
		
		
		
//		//Employee를 담을 수 잇는 5인 객체배열을 생성하고 임의의 값으로 객체 5개를 생성해
//		//각 배열의 인덱스값을 초기화해라.
//		Employee[] emp = new Employee[5];
//		
//		emp[0] = new Employee(1, "홍길동", 'm', "000-0000-0000");
//		emp[1] = new Employee(2, "홍길동", 'm', "000-0000-0000");
//		emp[2] = new Employee(3, "홍길동", 'm', "000-0000-0000");
//		emp[3] = new Employee(4, "홍길동", 'm', "000-0000-0000");
//		emp[4] = new Employee(5, "홍길동", 'm', "000-0000-0000");
//		
//		for(Employee e : emp) {
//			System.out.println(e);
//		}
//		
	sc.close();
	}
	

}

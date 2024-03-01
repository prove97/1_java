import java.util.Scanner;
import java.lang.Math;

public class Test240116 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
//		/*
//		 * 상수형 변수 num1, num2를 사용자로부터 입력받아
//		 * + - * / % 의 결과값을 각각 출력하세요.
//		 */
//		
//		int num1, num2;
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		
//		System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
//		System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
//		System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
//		System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
//		System.out.printf("%d %% %d = %d\n",num1,num2,num1%num2); // printf문의 주석에서 '%'를 쓸때는 %를 두번 써줘야함
//		//System.out.println(num1 + " % " + num2 + " = " + num1%num2);
		
		
//		/*
//		 * 가위바위보를 진행합니다. user1의 가위, 바위, 보 정보와
//		 * user2의 가위, 바위, 보 정보를 받아 누가 이겼는지를 출력하세요.
//		 * 가위바위보 정보는 숫자로 입력받습니다(가위 = 1, 바위 = 2, 보 = 3)
//		 */
//		
//		int user1, user2;
//		System.out.print("user1의 차례 : ");
//		user1 = sc.nextInt();
//		System.out.print("user2의 차례 : ");
//		user2 = sc.nextInt();
//
//		if(user1 > 0 && user1 <= 3 && user2 > 0 && user2 <= 3) {
//			if(user1 == user2) {
//				System.out.println("비겼습니다");
//			} else if(user1 ==  3 && user2 == 2 || user1 == 2 && user2 == 1 || user1 == 1 && user2 == 3) {
//				System.out.println("user1이 이겼습니다.");
//			} else if(user2 ==  3 && user1 == 2 || user2 == 2 && user1 == 1 || user2 == 1 && user1 == 3) {
//				System.out.println("user2이 이겼습니다.");
//			} 
//		} else
//			System.out.println("잘못입력하였습니다.");
		
		


//		/*
//		 * 15 ~ 111까지의 수를 순서대로 출력하세요.
//		 */
//		for(int i = 15; i <= 111; i++) {
//			System.out.println(i);
//		}
			
		
//		/*
//		 * 숫자를 입력받아 * 2인 숫자를 출력하세요.
//		 * 유저가 숫자 0을 입력할때까지 반복하세요.
//		 */
//
//		int num;
////		do {
////			System.out.print("숫자를 입력하세요 : ");
////			num = sc.nextInt();
////			System.out.println("2 * " + num + " : " + num*2);
////		} while(num != 0);
//		
//		while (true){
//			System.out.print("숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			if(num == 0)
//				break;
//			System.out.println("2 * " + num + " : " + num*2);
//		} 
		
		
		
		
		
//		/*
//		 * user3의 가위바위보 정보를 입력받고
//		 * 컴퓨터의 랜덤한 가위바위보 정보를 생성해
//		 * 누가 이겼는지를 출력하세요.
//		 * 가위바위보 정보는 숫자로 입력받습니다(가위 = 1, 바위 = 2, 보 = 3)
//		 * 해당 행위를 user3이 5를 입력받을 때까지 반복하세요.
//		 * 
//		 */
//		
//		int user3, com;
//
//		
//		while(true) {
//			System.out.print("user3의 차례 : ");
//			user3 = sc.nextInt();
//			com = (int)(Math.random()*3+1);
//			if(user3 <= 3 && user3 >=1) {
//				if(user3 == com) {
//					System.out.println("비겼습니다");
//				} else if(user3 > com || user3 == 1 && com == 3) {
//					System.out.println("user3이 이겼습니다.");
//				} else if(user3 < com || user3 == 3 && com == 1) {
//					System.out.println("컴퓨터가 이겼습니다.");
//				} 
//				
//			} else if (user3 == 5){
//				System.out.println("종료합니다.");
//				break;
//			} else {
//				System.out.println("잘못입력하였습니다.");
//			}
//
//		}
		
	}
	

}
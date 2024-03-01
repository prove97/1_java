import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		/*
		 * "월"요일부터 "일"요일까지 요일에 대한 정보를 가지고 있는 배열을 하나 만들어 줍니다.
		 * 0~6까지의 숫자를 입력받아 해당 인덱스에 있는 요일을 출력하고 범위에 없는 숫자를 입력시
		 * 0~6사이의 숫자를 입력하세요 : 를 출력하고 다시 입력을 받습니다.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		
		char[] week = {'일','월','화','수','목','금','토'};
		int n;
		
		do {
			System.out.print("0~6사이의 숫자를 입력하세요 : ");
			n = sc.nextInt();			
		} while(n < 0 || n > 6);
		
//		System.out.print("0~6사이의 숫자를 입력하세요 : ");
//		n = sc.nextInt();		
//		while(n < 0 || n > 6) {
//			System.out.print("0~6사이의 숫자를 입력하세요 : ");
//			n = sc.nextInt();		
//		}
		
		System.out.print(week[n]+"요일");
		
	}

}

package test0120;

import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		/*
		 * 정수하나를 입력받아 5이상의 숫자를 입력하였는지 확인하고
		 * 5이상을 입력하였다면 1부터 해당수까지 순차적으로 출력하는 프로그램을 만들어라
		 */

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num >= 5) {
			for(int i = 1 ;i <= num; i++){
				System.out.print(i + " ");
			}
		
			
		}
		
	}

}

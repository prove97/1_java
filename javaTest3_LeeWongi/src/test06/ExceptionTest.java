package test06;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 하나 입력 : ");
		int num = sc.nextInt();
		
		try {
			System.out.print("결과값 : " + new Calculator().getSum(num));
		} catch (InvalidException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		sc.close();

	}

}

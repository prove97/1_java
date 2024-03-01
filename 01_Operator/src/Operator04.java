import java.util.Scanner;

public class Operator04 {

	/*
	 * 비교연산자/관계연산자 (이항연산자)
	 * 두 값을 비교하는 연산자
	 * 비교연산자는 조건을 만족하면 true(참), 만족하지 않으면 false(거짓)를 반환
	 * 즉, 비교연산의 결과는 논리값이다.
	 * 
	 * 대소비교 연산자 : <, >, <=, >= 
	 * 동등비교 연산자 : ==, !=
	 * 
	 * 원시타입의 일반변수 -> 동등비교를 == !=로 진행하면 된다.
	 * 
	 * String(문자열)은 단순하게 ==로 동등비교할 수 없다.
	 * 이유는 참조변수(객체를 담는 변수)이기 때문에
	 * String 비교할 때 -> 문자열.equals(문자열);
	 * 
	 */
	
	public static void main(String[] args) {
//		int a = 10;
//		int b = 25;
//		
//		System.out.println("a == b : " + (a==b)); //false
//		System.out.println("a <= b : " + (a<=b)); //true
//		
//		boolean result = (a > b);
//		System.out.println("result : " + result);
//		
//		//산술연사 + 비교연산
//		System.out.println((a * 2) > (b / 5)); //true
//		
//		System.out.println("a가 짝수인가 : " + (a % 2 == 0));
//		System.out.println("a가 홀수인가 : " + ((a % 2 == 1) && (a % 2 != 0)));
		
//		// 두 수를 입력받아 어던 숫자가 더 큰지를 출력하는 프로그램
//		//
//		// 첫번째 정수 : ()
//		// 두번째 정수 : ()
//		// 첫번째가 두번째보다 큽니다 : (true/false)
//		// 첫번재 정수는 짝수입니다 : (true/false)
//		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("첫번째 정수 : ");
//		int c = input.nextInt();
//		input.nextLine();
//		
//		System.out.print("두번째 정수 : ");
//		int d = input.nextInt();
//		input.nextLine();
//		
//		System.out.println("첫번째가 두번째보다 큽니다 : " + (c > d));
//		System.out.println("첫번째가 정수는 짝수입니다 : " + (c % 2 == 0));		
		
		//특이케이스(문자와 숫자간의 대소비교 가능) 문자는 숫자로 인식되기 때문
		System.out.println('A' > 60);
		System.out.println((char)'A' +0);

		System.out.println('a'+ 0);
		System.out.println('z'+ 0);

		System.out.println('A'+ 0);
		System.out.println('Z'+ 0);
		//'A' ~ 'Z'는 65 ~ 90까지의 숫자로 연달아 나열되어있다.
		
		String str1 = new String("a");
		String str2 = new String("a");
		
		String s1 = "abcde";
		String s2 = "abcde";
		
		System.out.println(str1 == str2); // false -> 문자열로 객체를 생성, 서로 다른 주소값을 가르키기 때문에 false, 각 주소값을 따라 갔을 때 리터럴의 값은 같음
		
		System.out.println(s1 == s2); // true -> 리터럴이 같다고 판단하고 같은 주소를 가르키기 때문에 true(주소값이 같다는 의미)
		System.out.println("abcde" == "abcde"); // true
		
		System.out.println(str1.equals(str2)); 
		System.out.println("as".equals("as")); 

		
		
	}

}

import java.util.Scanner;

public class Operator05 {
	/*
	 * 논리연산자
	 * 두개의 논리값을 연산해주는 연산자
	 * 논리연산한 결과도 논리값이다.
	 * 
	 * 논리값 && 논리값 : 왼쪽, 오른쪽 두 논리값이 모두 true일 때 결과값이 true이다.
	 * 논리값 || 논리값 : 왼쪽, 오른쪽 둘 중에 하나라도 true값이 있을 경우 true이다.
	 *  
	 * && : 두개의 조건이 모두 true(AND = ~이고, 그리고, ~이면서, 뿐만아니라)
	 * 
	 * true && true -> true
	 * true && false -> false
	 * false && true -> false
	 * false && false -> false
	 * -> && 연산자를 기준으로 앞의 결과가 false일 경우 뒤의 조건은 굳이 실행하지 않는다.
	 * 
	 * || : 두개의 조건중 하나라도 true이면 결과값이 true이다.(or == 또는, ~이거나)
	 *  
	 * true || true -> true
	 * true || false -> true
	 * false || true -> true 
	 * false || false -> false
	 * -> ||연사자를 기준으로 앞의 결과가 true인 경우 뒤의 조건은 굳이 실행하지 않는다.
	 *  
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//사용자에게 숫자를 입력받아 해당 숫자가 1 ~ 100사이의 값인지 확인
//		System.out.print("정수 하나 입력 : ");
//		int num1 = sc.nextInt();
//		
//		// 0 < num1 <= 100  ->  0 < num1 && num1 <= 100
//		boolean result = (num1 > 0) && (num1 <= 100); // num1의 값이 1 이상이고, num1 값이 100 이하이다.
//		
//		System.out.println("사용자가 입력한 값이 1이상 100이하입니다 : " + result);
		
		
		/*
		 * && : 왼쪽, 오른쪽모든 연산의 결과가 true
		 *      하나라도 false가 나올시 false
		 */
		
//		// 사용자에게 알파벳 하나를 입력받아 대소문자인를 구분
//		// 문자 하나 입력 : 
//		// 사용자가 입력한 값이 대문자 입니다. : (true/false)
//		//
//		// 'A' -> 65, 'Z' -> 90
//		
//		System.out.print("문자 하나 입력 : ");
//		char ch = sc.next().charAt(0); // 문자열.charAt(index): 문자열에서 index번째의 문자를 저장
//		
//		// 대문자 -> (65 <= ch <= 90)
//		boolean res1 = (ch >= 65) && (ch <= 90); // 1번째 방법
		
//		boolean res2 = (ch >= 'A') && (ch <= 'Z'); // 2번째 방법
//		boolean res3 = (ch >= 'a') && (ch <= 'z'); 
//
		
//		System.out.println("사용자가 입력한 값이 대문자 입니다 : " + res1);
		
//		// 사용자에게 성별을 입려받은 후 여자인지 확인(* 소문자 f, 대문자 F 모두 가능)
//		// 성별(M/F) : 
//		// 사용자가 여자입니까 : (true/false)
//		
//		System.out.print("성별(M/F) : ");
//		char gender = sc.next().charAt(0);
//		
//		boolean res = (gender == 'f') || (gender == 'F');
//
//		System.out.println("사용자가 여자입니까 : " + res);
		
		int num1 = 10;
		boolean result1 = (num1 < 5) && (++num1 > 0); // && : 앞의 연산 결과가 거짓일 때, ++num1은 실행되지 않음
		
		System.out.println("result1 : " + result1);
		System.out.println("&&연산 후의 num1 : " + num1);
		
		int num2 = 10;
		boolean result2 = true || (++num2 > 0); // || : 앞의 연산 결과가 참일때, ++num2는 실행되지 않음 
		System.out.println("||연산 후의 num2 : " + num1); 

	}

}

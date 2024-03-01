import java.lang.Math;
import java.util.Scanner;

public class B_while {
	/*
	 * while문
	 * 
	 * [초기식]
	 * while(조건식){
	 *     반복적으로 실행할 코드;
	 *     [증감식;]   
	 * }
	 * 
	 * 조건식의 결과가 true일 경우 해당 코드를 실행한다.
	 * 
	 * 조건식 검사 --> true일 경우 실행코드 실행
	 * 조건식 검사 --> true일 경우 실행코드 실행
	 * 조건식 검사 --> false일 경우 실행코드 실행X -> 반복문 탈출
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		for(int i = 0; i<5; i++)
//			System.out.println("안녕하세요.");
//		
//		int i = 0; //초기식
//		while(i < 5) { //조건식
//			System.out.println("안녕하세요.");
//			i += 1; //증감식
//		}
		
//		/*
//		 * 1에서부터 10000사이의 홀수만을 출력
//		 * 1 3 5 7 9
//		 */
//		
//		for(int i = 1; i <=10000; i++) {
//			if(i%2 ==1)
//				System.out.print(i + " ");
//		}
//				System.out.println();
//		
//		
//		int i = 1;
//		while(i<=10000) {
//			if(i%2 == 1) {
//				System.out.print(i + " ");
//			}
//			i++;
//		}
		
//		/*
//		 * 1부터 랜덤값(1~100사이) 까지의 합계를 출력
//		 * 1에서부터 xx까지의 총 합계 : xxxx
//		 */
//		int sum = 0;
//		int random = (int)(Math.random()*100+1);
//		for(int i = 1; i <= random; i++) {
//			sum += i;
//		}
//		System.out.printf("1에서부터 %d까지의 총 함계 : %d\n", random, sum);
//			
//		int i = 1;
//		sum = 0;
//		while(i <= random) {
//			sum += i;
//			i++;
//		}
//		System.out.printf("1에서부터 %d까지의 총 함계 : %d\n", random, sum);
		
		
		/*
		 * 사용자에게 문자열을 입력받아
		 * 해당 문자열의 짝수자리 글자만 출력
		 * 문자열을 입력 : hello
		 * el
		 * 
		 * 1. 문자열입력받기
		 * 2. 입력받은 문자열 반복문으로 하나씩 전부 출력해보기
		 * 3. 짝수자리만 출력하기
		 */
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		//System.out.println(str); //입력받은 문자열 출력
		
		int i = 0;
		while(i < str.length()) {
			//System.out.println(i);
			if(i%2 == 1)					
				System.out.println(str.charAt(i)); 
			//System.out.println(i);
			i++;
		}
	}
}

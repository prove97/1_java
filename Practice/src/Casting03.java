
public class Casting03 {

	public static void main(String[] args) {
		/*
		 * 선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+, =, *, /)과 형변환을 이용하여
		 * 다음과 같은 값이 나오도록 코드를 작성하세요.
		 * 
		 */
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1/iNum2); //2
		System.out.println((int)dNum); //2
		
		System.out.println(iNum2*dNum); //10.0
		System.out.println((float)iNum1); //10.0 
		
		System.out.println((float)iNum1/iNum2); //2.5
		System.out.println(dNum); //2.5

		System.out.println((int)fNum); //3
		System.out.println((int)(iNum1/fNum)); //3

		System.out.println(iNum1/fNum); //3.3333333 ->
		System.out.println((double)iNum1/fNum); //3.3333333333333335 -> iNum1을 먼저 double형으로 바꿔줌, 
		// 실수형은 시스템 상 정확한 실수 표현이 불가, 미세한 오차가 발생할 수 있다
		
		System.out.println("\'" + ch + "\'"); // 'A'
		System.out.println((int)ch); // 65
		System.out.println(ch+iNum1); // 75
		System.out.println("\'" + (char)(ch+iNum1) +"\'"); // 'K'
	}
}
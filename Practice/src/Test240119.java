import java.util.Scanner;
public class Test240119 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		// 정수형 변수 age를 입력받아 7세 이하면 어린이, 19세 이하면 청소년, 20세 이상이면 성인을 출력하세요
//		System.out.print("나이를 입력 : ");
//		int age = sc.nextInt();
//		if(age<=7){
//			System.out.println("어린이");
//		} else if(age<=19) {
//			System.out.println("청소년");
//		} else {
//			System.out.println("성인");
//		}
		
		
		
//		// 정수 num1, num2 두개를 입력받아ㅣ두 수 사이에 있는 3의 배수의 모든 합을 구하세요.
//		int num1 , num2;
//		System.out.print("첫번째 숫자 입력 : ");
//		num1 = sc.nextInt();
//		
//		System.out.print("두번째 숫자 입력 : ");
//		num2 = sc.nextInt();
//		
//		int sum = 0;
//		for(int i = (num1>num2 ? num2 : num1); i <= (num1>num2 ? num1 : num2); i++) {
//			sum += i%3==0 ? i : 0;
//		} 
//		System.out.println("3의 배수의 모든 합 : "+ sum);
		
		
		
//		// 정수 num1, num2를 입력받아 두 수 사이에 있는 모든 홀수의 합과 짝수의 합을 각각 구하세요.
//		int num1 , num2;
//		System.out.print("첫번째 숫자 입력 : ");
//		num1 = sc.nextInt();
//		
//		System.out.print("두번째 숫자 입력 : ");
//		num2 = sc.nextInt();
//		
//		int odd_sum, even_sum;
//		odd_sum = 0; even_sum = 0;
//		
//		for(int i = (num1>num2 ? num2 : num1); i <= (num1>num2 ? num1 : num2); i++) {
//			if(i%2 == 1) {
//				odd_sum += i;
//			} else
//				even_sum += i;
//		} 
//		System.out.println("홀수의 모든 합 : "+ odd_sum);
//		System.out.println("짝수의 모든 합 : "+ even_sum);
		
		
		
//		/*
//		 * 첫째줄에 데이터의 개수 n개를 입력받고
//		 * 사용자로부터 n개의 정수를 입력받아 입력받은 대로 출력하세요.
//		 * ex ) 정수 입력 : 5
//		 * 숫자 입력 : 1 7 5 9 4
//		 * 반대로 출력 : 4 9 5 7 1 
//		 */		
//		System.out.print("정수 입력 : ");
//		int size = sc.nextInt();
//		int[] iArr = new int[size];
//
//		System.out.print("숫자 입력 : ");
//		for(int i = 0; i < iArr.length; i++) {
//			iArr[i] = sc.nextInt();
//		}
//		System.out.print("반대로 출력 : ");
//		for(int i = iArr.length -1; i >= 0; i--) {
//			System.out.print(iArr[i] + " ");
//		}
		
		
		
		
		/*
		 * 사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
		 * 문자형 가변 배열을 선언 및 할당하세요.
		 * 그리고 각 인덱스에 'a'부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		 * 
		 * ex)
		 * 행의 크기 : 3
		 * 0행의 열 크기 : 2
		 * 1행의 열 크기 : 6
		 * 2행의 열 크기 : 3
		 * a b
		 * c d e f g h
		 * i j k
		 */
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		//int cnt = 0;
		char ch = 'a';
		char[][] charArr = new char[row][];
		for (int i = 0; i < charArr.length; i++) { // 2차원 배열에 값들 입력 
			System.out.print(i + "행의 열 크기 : ");
			charArr[i] = new char[sc.nextInt()];
			for(int j = 0; j <charArr[i].length; j ++) {
				//charArr[i][j] += 'a' + cnt;
				//cnt++;
				charArr[i][j] += ch;
				ch++;
			}
		}
		
		for (int i = 0; i < charArr.length; i++) { // 2찬원 배열 출력
			for(int j = 0; j <charArr[i].length; j ++) {
				System.out.print(charArr[i][j] + " ");
			}
			System.out.println();
		}
	
		sc.close();
	}

}

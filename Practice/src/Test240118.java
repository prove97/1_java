import java.util.Scanner;

public class Test240118 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		/*
//		 * 실수 num1과 num2를 사용자로부터 입력받아 + % / 3가지의 결과를 출력해라
//		 */
//		double num1, num2;
//		System.out.printf("첫번째 실수 입력 : ");
//		num1 = sc.nextDouble(); 
//		System.out.printf("두번째 실수 입력 : ");
//		num2 = sc.nextDouble(); 
//		
//		System.out.printf("%.1f + %.1f = %f\n",num1, num2, num1+num2);
//		System.out.printf("%.1f %% %.1f = %f\n",num1, num2, num1%num2);
//		System.out.printf("%.1f / %.1f = %f\n",num1, num2, num1/num2);
		
		
//		/*
//		 * 정수형 변수 num3을 사용자로부터 입력받아 100보다 작으면 100이하
//		 * 100보다 크고 200보다 작으면 200이하
//		 * 200보다 크고 300보다 작으면 300이하를 출력하고 
//		 * 그것도 아니면 300초과를 출력해라
//		 */
//		
//		int num3;
//		System.out.print("정수 입력 : ");
//		num3 = sc.nextInt();
//		
//		if(num3 < 100) {
//			System.out.println("100 이하");
//		} else if(num3 < 200) {
//			System.out.println("200 이하");
//		} else if(num3 < 300) {
//			System.out.println("300 이하");
//		} else
//			System.out.println("300 초과");
			
		
//		/*
//		 * 수학, 영어, 국어 성적을 입력받아 평균이 60이상이면 합격입니다.
//		 * 60보다 작으면 불합격입니다. 출력
//		 */
//		
//		int ma, en, ko;
//		System.out.print("수학 : ");
//		ma = sc.nextInt();
//		System.out.print("영어 : ");
//		en = sc.nextInt();
//		System.out.print("국어 : ");
//		ko = sc.nextInt();
//		
//		if((ma + en + ko)/3 > 60) {
//			System.out.print("합격입니다.");
//		} else
//			System.out.print("불합격입니다.");
		
		
		
//		/*
//		 * 국어 성적을 입력받아 50이하는 f학점 50점초과 60점이하는 d학점
//		 * 60점초과 70점 이하는 c학점
//		 * 70점초과 80점 이하는 b학점
//		 * 80점초과는 a학점을 출력하는 프로그램을 작성해라
//		 */
//		
//		int ko;
//		System.out.print("국어 점수 : ");
//		ko = sc.nextInt();
//		
//		if(ko <= 50) {
//			System.out.println("F");
//		} else if(ko <= 60) {
//			System.out.println("D");
//		} else if(ko <= 70) {
//			System.out.println("C");
//		} else if(ko <= 80) {
//			System.out.println("B");
//		} else {
//			System.out.println("A");
//		}		
		
		
		
		
//		/*
//		 * 크기가 9인 1차원배열 arr1을 작성하고 구구단 2단을 각 인덱스에 대입하고 출력해라
//		 * ex) arr1[0] = "2 * 1 = 2";
//		 */
//		String[] arr1 = new String[9];
//		
//		for (int i = 0; i < arr1.length; i++) {
//			arr1[i] = "2 * " + (i+1) + " = " + 2*(i+1); 
//			System.out.println(arr1[i]);
//		}
		
		
		
//		/*
//		 * 크기가 9인 1차원배열 arr2을 작성하고 구구단 3단을 각 인덱스에 대입하고 출력해라
//		 * ex) arr2[0] = "3 * 1 = 3";
//		 */
//		String[] arr2 = new String[9];
//		
//		for (int i = 0 ; i < arr2.length; i++) {
//			arr2[i] = "3 * " + (i+1) + " = " + 3*(i+1); 
//			System.out.println(arr2[i]);
//		}
		
		
		
		/*
		 * 크기가 [9][9]인 2차원배열 arr3을 작성하고 구구단 2~9단을 각 인덱스에 대입하고 출력해라
		 * ex) arr3[0][0] = "2 * 1 = 2"; 
		 */
		String[][] arr3 = new String[8][9];
		
		// 구구단의 한 단을 배열에 저장하는 반복문
		for (int i = 0 ; i < arr3.length; i++) {
			int dan = i+2;
			System.out.println("===== " + dan + "단 =====");
			for (int j = 0 ; j < arr3[i].length; j++) {
				int su = j+1;
				arr3[i][j] = dan + " * " + su + " = " + dan*su;
				System.out.println(arr3[i][j]);
			}
			System.out.println();
		}
		
	}

}

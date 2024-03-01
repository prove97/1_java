import java.util.Scanner;

public class Casting02 {

	public static void main(String[] args) {
		/*
		 * 실수형으로 국어, 영어, 수학 세과목의 점수를 입력받아 총점과 평균을 출력하세요.
		 * 이 때 총점과 평균은 정수형으로 처리하세요.
		 * 
		 * ex.
		 * 국어 : 90.0
		 * 수학 : 90.0
		 * 영어 : 90.0
		 * 
		 * 총점 : 270
		 * 평균 : 90
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double ko, math, en;
		int total, average;
		System.out.print("국어 : ");
		ko = sc.nextDouble();
		//sc.nextLine();
		
		System.out.print("영어 : ");
		en = sc.nextDouble();
		//sc.nextLine();
		
		System.out.print("수학 : ");
		math = sc.nextDouble();
		//sc.nextLine();
		
		total = (int)(ko + en + math);
		average = (int)(ko + en + math)/3;

		System.out.println();
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		
	}

}

import java.util.Scanner;

public class Controll02 {

	public static void main(String[] args) {
		/*
		 * 정수형으로 국어, 영어, 수학 세과목의 점수를 입력받아 총점과 평균을 계산하고
		 * 합격인지 불합격인지 나타내는 프로그램을 작성하세요.
		 * (합격 조건 : 세과목 점수가 각각 40점 이상 그리고 편균이 60점 이상일 경우
		 * 
		 * ex.
		 * 국어점수 : 88
		 * 수학점수 : 50
		 * 영어점수 : 40
		 * 
		 * 총점 : 270
		 * 평균 : 90
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int ko, math, en, total; 
		double average;
		System.out.print("국어점수 : ");
		ko = sc.nextInt();
		//sc.nextLine();
		
		System.out.print("수학점수 : ");
		math = sc.nextInt();
		//sc.nextLine();

		System.out.print("영어점수 : ");
		en = sc.nextInt();
		//sc.nextLine();
		
		
		total = ko + math + en;
		average = total/3;

		if(ko >= 40 && en >= 40 && math >= 40 && average >= 60) {
				System.out.println("국어 : " + ko);
				System.out.println("수학 : " + math);
				System.out.println("영어 : " + en);
				System.out.println("합계 : " + total);
				System.out.println("평균 : " + average);
				System.out.println("축하합니다, 합격입니다!");
		} else {	
			System.out.println("불합격입니다");
			return;
		}
	}
}



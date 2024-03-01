import java.util.Scanner;

public class A_if02 { // A__if02 이름을 가진 클래스

	public static void main(String[] args) { // main 메소드 영역
		Scanner sc = new Scanner(System.in);
		
//		/*
//		 * 나이를 입력받아
//		 * 13세 이하 : 어린이
//		 * 13세 초과 19세 이하 : 청소년
//		 * 19세 초과 : 성인
//		 * xx세는 xxx에 속합니다.
//		 *  
//		 */
//		int age;
//		String type = "";
//		
//		System.out.println("나이(정수만) : ");
//		age = sc.nextInt();
//		sc.nextLine();
//		
//		//else문과 함께 -> 해당되는 조건문만 거쳐감
////		if(age <= 13) 
////			type = "어린이";
////		else if(age > 13 && age <= 19) 
////			type = "청소년";
////		else
////			type = "성인";
//		
//		//if문만 이용해서 -> 모든 if문을 불필요하게 전부 거쳐감
//		if(age <= 13) 
//			type = "어린이";
//		if(age > 13 && age <= 19) 
//			type = "청소년";
//		if(age > 19)
//			type = "성인";
//		
//		System.out.printf(age + "세는 " + type + "에 속합니다.");
//		//System.out.printf("%d세는 %s에 속합니다.", age, type);
		
		// =====================================================
		
//		/*
//		 * 성별을 (m/f)(대소문자 상관없음)로 입력받아 남학생인지 여학생인지
//		 * 출력하는 프로그램을 작성하세요
//		 * 성별(m/f) : 
//		 * 여학생입니다 / 남학생입니다 / 잘못입력하셨습니다
//		 */
//		
//		System.out.print("성별(m/f) : ");
//		char gender = sc.next().charAt(0);
//		//String result = ""; // 문자열 변수에 담아서 결과값을 출력
//		
//		if (gender == 'm' || gender == 'M') {
//			System.out.println("남학생입니다");
//			//result = "남학생";
//		} else if (gender == 'f' || gender == 'F') {
//			System.out.println("여학생입니다");
//			//result = "여학생";
//		} else {
//			System.out.println("잘못입력하셨습니다");
//			//return; // 해당 메소드 자체를 빠져나가는 구문
//		}		
//		//System.out.println(result);
		
		// =====================================================
		
		/*
		 * 정수(양수)를 입력받아
		 * 짝수인지 홀수인지 출력하는 프로그램 작성
		 * 정수(양수) 입력 : ()
		 * 짝수다 / 홀수다 /양수가 아닙니다. 잘못입력하셨습니다.
		 */
		int num;
		String result;
		
		System.out.print("정수(양수) 입력 : ");
		num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0) {
			if(num % 2 == 0) {
				result = "짝수";
			} else {
				result = "홀수";
			}
		} else {
			result = "양수가 아닙니다. 잘못입력하셨습니다.";
		}
		
		System.out.println(result);
	}

}

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		/*
		 * 이름, 성별, 나이, 키를 사용자에게 입력받아 각각의 값을 변수에 담고 출력하세요.
		 * 문자열.charAt(index) : 문자열에서 내가 원하는 index의 글자를 가져온다. (index : 몇번째인지)
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = input.next();

		System.out.print("성별을 입력하세요 : ");
		char gender = input.next().charAt(0); 
		
		System.out.print("나이를 입력하세요 : ");
		int age = input.nextInt();
		input.nextLine();
		
		System.out.print("키를 입력하세요 : ");
		float height = input.nextFloat();
		input.nextLine();
		
		System.out.println("키 "+ height + "cm인 " + age + "살 "+ gender + "자 " + name + "님 반갑습니다");
		System.out.printf("키 %.1fcm인 %d살 %c자 %s님 반갑습니다.", height, age, gender, name);
		// 실수 포맷 소수점 설정: %.(원하는 소수점 자리)f 
	}
}

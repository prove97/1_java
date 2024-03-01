import java.util.Scanner;

public class Controll01 {

	public static void main(String[] args) {
		/* 
		 * 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 "ㅇㅇ메뉴입니다"를,
		 * 종료 번호를 누르면 "프로그램이 종료됩니다"를 출력하세요
		 * 
		 * ex.
		 * 1. 입력
		 * 2. 수정
		 * 3. 조회
		 * 4. 삭제
		 * 7. 종료
		 * 메뉴번호를 입력하세요 : 4
		 * 삭제 메뉴입니다.
		 */
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String str = "";
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴번호를 입릭하세요 : ");
		num = sc.nextInt();
		
//		if(num == 1) {
//			str = "입력";
//		} else if(num == 2) {
//			str = "수정";
//		} else if(num == 3) {
//			str = "조회";
//		} else if(num == 4) {
//			str = "삭제";
//		} else if(num == 7) {
//			str = "종료";
//		} else {
//			System.out.println("잘못 입력하였습니다");
//			return;
//		}
		
		switch (num) {
		case 1:
			str = "입력";
			break;
		case 2:
			str = "수정";
			break;
		case 3:
			str = "조회";
			break;
		case 4:
			str = "삭제";
			break;
		case 7:
			str = "종료";
			break;
		default:
			System.out.println("잘못 입력하였습니다");
			return;
		}
		
		System.out.println(str + " 메뉴입니다");
		
	}

}

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		/*
		 *  키보드로 가로, 세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		 *  공식) 면적 : 가로 * 세로
		 *       둘레 : (가로 + 세로) * 2
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		float x = sc.nextFloat();
		sc.nextLine();
		
		System.out.print("세로 : ");
		float y = sc.nextFloat();
		sc.nextLine();
		
		System.out.println("면적 : " + (x * y));
		System.out.println("둘레 : " + (2*(x + y)));

//		System.out.printf("면적 : %.2f\n", (x * y));
//		System.out.printf("둘레 : %.2f", 2*(x + y));		
	}
}

import java.util.Scanner;

public class Loop03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan;
		System.out.print("숫자 : ");
		dan = sc.nextInt(); 		
		
		while(dan>9 || dan<1) {
			System.out.print("1이상 9이하의 숫자만 입력해주세요 \n\n숫자 : ");
			dan = sc.nextInt();
			sc.nextLine();
		}

		for (int i = dan; i <= 9; i++) {
			System.out.println("===== " + i + "단 =====");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}
		}
		
	}

}

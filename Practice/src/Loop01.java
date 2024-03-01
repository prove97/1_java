import java.util.Scanner;

public class Loop01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n; 
		System.out.print("1 이상의 숫자를 입력하세요 : ");

		while(true) {
			n = sc.nextInt();
			if(n >= 1) {
				for(int i = 0; i < n; i++) {
					System.out.print((i+1) + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				System.out.print("입력 : \n");
			}
	
		}

	}

}

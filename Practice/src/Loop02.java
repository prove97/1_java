import java.util.Scanner;

public class Loop02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		System.out.print("첫번재 숫자 : ");
		n1 = sc.nextInt();
		sc.nextLine();
		
		// n1이 1보다 작다면 다시 입력받기 반복
		while(n1 <1) {
			System.out.print("1 이상의 숫자를 입력해 주세요 : ");
			n1 = sc.nextInt();
		}
		
		System.out.print("두번재 숫자 : ");
		n2 = sc.nextInt();
		sc.nextLine();
		
		// n2이 1보다 작다면 다시 입력받기 반복
		while(n2 <1) {
			System.out.print("1 이상의 숫자를 입력해 주세요 : ");
			n2 = sc.nextInt();
		}

			
//		if(n1 >= n2) { //n1과 n2가 같을 때 포함
//			for(int i = n2; i <= n1; i++) {
//				System.out.print(i + " ");
//			}
//		} else if(n1 < n2) {
//			for(int i = n1; i <= n2; i++) {
//				System.out.print(i + " ");
//			}			
//		} 

//		for(int i = (n1 <= n2 ? n1 : n2); i <= (n1 <= n2 ? n2 : n1); i++) { // 위의 조건식 삼항연산자로 간소화
//			System.out.print(i + " ");
//		}
		
		for(int i = (n1 <= n2 ? n1+1 : n2+1); i <= (n1 <= n2 ? n2-1 : n1-1); i++) { // 위의 조건식 삼항연산자로 간소화
			System.out.print(i + " ");
		}
		
		
	}

}

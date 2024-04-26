import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();				
		int m = sc.nextInt();
		sc.nextLine();
		
		int[] iArr = new int[n];
		for(int i=0; i<n; i++) {
			iArr[i] =i+1; 
		}
		
		int a, b, tmp;
		for(int i=0; i<m; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			sc.nextLine();
			
			for(int j=a; j<b; j++) {
				int[] tmpArr = new int[b-a+1];
			}			
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(iArr[i] + " ");
			
		}
		
	}
		

}


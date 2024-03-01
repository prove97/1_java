import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		// 사용자에게 입력받은 양의 정수만큼 배열의 크기를 할당하고
		// 1부터 입력받은 값까지 배열에 초기화한 후 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		int size;
		System.out.print("양의 정수 입력: ");
//		size = sc.nextInt();
		int[] iArr = new int[size=sc.nextInt()];
		
		for(int i = 0; i < size; i++) {
			iArr[i] = i+1;
		}
		for(int i = 0; i < size; i++) {
			System.out.println("iArr[" + i + "]" + " = " + iArr[i]);
		}		
	}

}


import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int size = sc.nextInt();
		int[] iArr = new int[size];
		String str = "";
		
		int sum = 0;
		for(int i = 0; i < iArr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			iArr[i] = sc.nextInt();
			str += iArr[i] + " ";
			sum += iArr[i];
		}
		
		System.out.println(str);
		System.out.println("총 합 : " + sum);
		
	}

}


import java.util.Scanner;

public class Array06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size;
		System.out.print("정수 : ");
		size = sc.nextInt();

		while(!(size >= 3 && size % 2 == 1)) {
			System.out.println("다시 입력하세요.");
			System.out.print("정수 : ");
			size = sc.nextInt();
		}
		
		int[] iArr = new int[size];
				
//		for(int i = 0; i< size; i++) {
//			if(i <= size/2) {
//				iArr[i] = i+1;
//			} else
//				iArr[i] = iArr[size-i-1];
//		
//			System.out.print(iArr[i] + " ");
//		}
		
		
		int mid = size/2;
		int cnt = 0;
		for(int i = 0; i < iArr.length; i++) {
			if(i <= mid) {
				iArr[i] = ++cnt;
			} else
				iArr[i] = --cnt;
		
			System.out.print(iArr[i] + " ");
		}

		
//		int mid = size/2;
//		iArr[0] = 1;
//		System.out.print(iArr[0] + " ");
//		
//		for(int i = 1; i<=mid; i++) {
//			iArr[i] = iArr[i-1]+1;
//			System.out.print(iArr[i] + " ");
//		}
//		for(int i = mid+1; i < iArr.length; i++) {
//			iArr[i] = iArr[i-1]-1;
//			System.out.print(iArr[i] + " ");
//		}
 		
		
		
		
	}

}

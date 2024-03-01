import java.util.Scanner;
import java.lang.Math;

public class A_Array03 {

	public static void main(String[] args) {
//		/*
//		 * 1. 크기가 10인 정수형 배열 생성 후
//		 * 
//		 * 2. 반복문을 활용해서 0번 인덱스부터 마지막 인덱스까지 순차적으로 접근하면서 같은 값을 대입
//		 *    매번 1 ~ 100 사이의 랜덤값
//		 *    
//		 * 3. 반복문을 활용해서 해당 배열의 0번 인덱스 ~ 마지막 인덱스까지 담겨있는 값을 전부 출력
//		 * arr[x] : xx
//		 */
//		
//		int[] arr = new int[10];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*100+1);
//			System.out.println("arr[" + i +"] : " + arr[i]);
//		}
		
		
//		/*
//		 * 1. 사용자에게 배열의 길이를 입력받은 후
//		 *    해당 크기의 문자열 배열을 생성
//		 *    
//		 * 2. 반복문을 활용해서 매번 사용자에게 과일명을 입력받아 그값을 매 인덱스 자리에 대입(0 ~ 마지막 인덱스)
//		 * 
//		 * 3. 반복문을 이용해서 0~마지막인덱스까지 담긴 값을 출력
//		 * 
//		 */
//		
//		Scanner sc = new Scanner(System.in);
//		int size;
//		
//		System.out.print("배열의 길이 : ");
//		size = sc.nextInt();
//		sc.nextLine();
//		
//		String[] strArr = new String[size]; 
//		
//		for (int i = 0; i < strArr.length; i++) {
//			System.out.print("좋아하는 과일을 입력하세요. : ");
//			strArr[i] = sc.next();
//		}
//		
//		for (int i = 0; i < strArr.length; i++) {
//			System.out.printf("%s\n",strArr[i]);
//		}
		
		
//		 // 사용자에게 문자열 하나 입력받은 후
//		 // 각각의 인덱스에 있는 문자들을 char배열에 옮겨담기
//		 
//		 // 1. 사용자에게 문자열 한개입력받기
//		Scanner sc = new Scanner(System.in);
//		  
//		String str;
//		System.out.print("문자열 입력 : ");
//		str = sc.next();
//
//		// 2. char배열 생성해두기(배열의 길이 == 문자열의 길이)
//		char[] chArr = new char[str.length()];
//		  
//		 // 3. 반복문을 통해서 해당 문자열에서 각각 인덱스별 문자를 char배열에 각 인덱스에 대입
//		for(int i = 0; i < chArr.length; i++) {
//			chArr[i] = str.charAt(i);
//		}
//		  
//		 // 4. 반복문을 이용해서 해당 배열의 0~마지막 인덱스까지 담긴 값을 출력
//		for(int i = 0; i < chArr.length; i++) {
//			System.out.println((i+1) + "번째 문자 : " + chArr[i]);
//		}

		
		// 1. 사용자에게 배열의 길이를 입력받은 후 해당크기만큼의 정수배열 생성
		Scanner sc = new Scanner(System.in);
			
		int size;
		System.out.println("정수 배열의 길이 : ");
		size = sc.nextInt();
		int[] iArr = new int[size];
		
		// 2. 반복문 활용해서 0~마지막인덱스까지 매번 1~100사이의 랜덤값 발생시켜 대입
		for(int i = 0; i < size; i++) {
			iArr[i] = (int)(Math.random() * 100 + 1);
		}
			
		// 3. 반복문을 활용해서 배열에 담긴 모든 값을 출력함과 동시에 
		//    짝수인 값들의 총 합을 구해라
		int sum = 0;
		for(int i = 0; i < size; i++) {
			System.out.println("iArr[" + i + "] : " + iArr[i]);
			if(iArr[i] % 2 == 0)
				sum +=iArr[i];
		}
			
		// 4. 위에서 구한 짝수값의 총합을 출력
		System.out.println("짝수의 총 합 : " + sum);
		
	}

}

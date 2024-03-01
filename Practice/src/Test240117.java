import java.util.Scanner;
import java.lang.Math;

public class Test240117 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		// 사용자로부터 정수형 변수 num1과 num2를 입력받아 큰값에서 작은값을 뺀 결과를 출력하세요.
//		int num1, num2, result;
//		
//		System.out.print("첫번째 정수 입력: ");
//		num1 = sc.nextInt();
//		
//		System.out.print("두번째 정수 입력: ");
//		num2 = sc.nextInt();
//		
//		System.out.println(result = num1 > num2 ? num1 - num2 : num2 - num1);
				
		
				
//		// 85에서 10까지 수를 1씩 줄여가며 모든 사이에 숫자를 출력하세요.
//		for (int i = 85; i >= 10; i--) {
//			System.out.print(i + " ");
//		}
				
				
//		// 임의의 숫자 하나(1~5)를 생성하고 이를 맞는 프로그램 작성
//		// 몇번만에 맞췄는지를 출력하세요.
//		// ex)
//		// 컴퓨터가 생각하는 수는 : 4(사용자 입력)
//		// 컴퓨터가 생각하는 수는 : 2(사용자 입력)
//		// 정답입니다. 2번만에 맞추셨습니다.
//		
//		int cnt, target, random;
//		cnt = 0;
//		target = (int)(Math.random() * 5 + 1);
//
//		do {
//			random = (int)(Math.random() * 5 + 1);
//			System.out.println("컴퓨터가 생각하는 수는 : " + random);
//			
//			cnt++;
//		} while(target != random);
//		System.out.println("축하합니다. " + cnt + "번 만에 맞추셨습니다.");
//		
//		/*
//		while(true) {
//			random = (int)(Math.random() * 5 + 1);
//			System.out.println("컴퓨터가 생각하는 수는 : " + random);
//			
//			if (random == target) {
//				System.out.println("축하합니다. " + cnt + "번 만에 맞추셨습니다.");
//				break;
//			}
//			cnt++;
//		}*/
		
		
		
//		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		// 순서대로 대입하고 그 값을 출력하세요.
//		int[] iArr = new int[10];
//		
//		for (int i = 0; i < iArr.length; i++) { // 대입을 위한 반복
//			iArr[i] = i+1;
//		}
//		
//		for (int i=0; i<10; i++) { // 출력을 위한 반복
//			System.out.println("iArr[" + i + "]" + " = " + iArr[i]);
//		}
		
		
		
		// 로또 추첨 번호를 예상하는 프로그램 작성
		// 임의의 숫자를 1에서 45까지 총 6개 추첨하여 당첨번호를 구합니다.
		// 중복된 숫자는 있으면 안된다.
		// 길이가 6인 배열만들고
		// 반복문을 통해서 6개의 난수를 각각의 배열의 인덱스값에 대입
		// 단, 생성한 난수가 이미 배열에 존재하는 값일 경우
		// 다시 생성해서 대입
		
		int[] iArr = new int[6];
		
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = (int)(Math.random()*45 +1);
			if(i > 0) {
				for(int j = 0; j < i; j++) { // 그 전까지의 배열을 검사해서 겹치는게 있으면 다시 대입(중복 검사)
					//while(iArr[i] == iArr[j]) {
					//	iArr[i] = (int)(Math.random()*45 +1);
					//}
					if(iArr[i] == iArr[j]){
						i--;
						break;
					}
				}
				
			}
						
		}
		for(int i = 0; i < 6; i++) {
			System.out.println(iArr[i]);
		}
	}

}

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇개 들어가 있는지
		// 개수와 몇번째 인덱스에 위치하는지 인덱스를 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.next(); // 문자열 입력 받음
		
		char[] chArr = new char[str.length()]; // 문자열 배열 생성

		System.out.print("문자 : ");
		char target = sc.next().charAt(0); // 문자열에서 찾을 문자 입력
		
		int cnt = 0; // target 문자가 문자열에 들어있는 개수
		String index = ""; // 몇번째 인덱스에 들어있는지 입력
		for(int i = 0; i < str.length(); i++) {
			chArr[i] = str.charAt(i);
			if(chArr[i] == target) {
				index += i + " ";
				cnt++;
			}
		}
		
		System.out.println( str + "에 " + target + "가 존재하는 위치(인덱스) : " +index);
		System.out.println(target +"개수 : " + cnt);
	}

}

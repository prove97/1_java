import java.util.Scanner;

public class Casting01 {
	/*
	 * 키보드로 문자 하나를 입력받아 그 문자의 유니코드를 출력하세요.ㅣ	    
	 * ex) 
	 * 문자 : A
	 * unicode : 65
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
//		System.out.print("unicode : " + (int)ch);
		System.out.print("unicode : " + (ch + 0));
	}

}

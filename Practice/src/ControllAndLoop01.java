import java.util.Scanner;

public class ControllAndLoop01 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 문자열을 입력받고 문자열의 검색될 문자를 입력ㅂ다아 해당문자가 몇개 있는지 개수를 출력하세요
		 * 그리고 다시하시겠습니까? : 표시해준뒤 y를 입력하면
		 * 다시 반복하고 다른 문자를 입력하면 종료
		 * 
		 * 문자열 : banana
		 * 문자 : a
		 * banana안에 포함된 a의 개수 :3
		 * 다시 하시겠습니까?(y/n) : y
		 * 
		 * 문자열 : banana
		 * 문자 : a
		 * banana안에 포함된 a의 개수 :3
		 */

		Scanner sc = new Scanner(System.in);
		String str;
		char ch, toBeContinue;
		int cnt;
		
		do {
			System.out.print("문자열 : ");
			str = sc.next();
			System.out.print("문자 : ");
			ch = sc.next().charAt(0);
			cnt = 0;
			for(int i = 0; i <str.length(); i++) {
				if(str.charAt(i) == ch) {
					cnt++;
				}
			}
			System.out.println(str + "안에 포함된 " + ch + "의 개수 : " + cnt);
			
			System.out.print("다시 하시겠습니까?(y/n) : ");
			
			toBeContinue = sc.next().charAt(0);

		} while(toBeContinue == 'y');
		
		
	}

}

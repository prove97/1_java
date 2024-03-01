import java.util.Scanner;

public class Controll03 {

	public static void main(String[] args) {
		/*
		 * 아이디와 비밀번호를 입력받아 지정해둔 아이디와 비밀번호와 비교해서
		 * 로그인 성공 시 로그인 성공
		 * 아이디가 틀렸을 시 "아이디가 틀렸습니다"
		 * 비밀번호가 틀렸을 시 "비밀번호가 틀렸습니다"를 출력하세요
		 */
		Scanner sc = new Scanner(System.in);
		
		String id = "myId";
		String pwd = "myPassword12";
		
		String checkId, checkPwd;
		
		System.out.print("아이디 : ");
		checkId = sc.nextLine();
		System.out.print("비밀번호 : ");
		checkPwd = sc.nextLine();
		
		if(checkId.equals(id) == true && checkPwd.equals(pwd)) {
			System.out.println("로그인 성공");
		}
		else {
			if(checkId.equals(id) == false) {
				System.out.println("아이디가 틀렸습니다");
				return;
			}
			if(checkPwd.equals(pwd) == false) {
				System.out.println("비밀번호가 틀렸습니다");
			}
		}
		
	}

}

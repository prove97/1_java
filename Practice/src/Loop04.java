import java.util.Scanner;

public class Loop04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String op;
		int n1, n2;
		
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			op = sc.next();
			
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수1 : ");
			n1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			n2 = sc.nextInt();
			
			if(op.equals("/") && n2 == 0 || op.equals("%") && n2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
				continue;
			}
			
//			switch(op) {
//			case "+":
//				System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
//				break;
//			case "-":
//				System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
//				break;
//			case "*":
//				System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
//				break;
//			case "/":
//				System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
//				break;
//			case "%":
//				System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
//				break;
//			}
						
			
			
			if(op.equals("+")) {
				System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			} else if(op.equals("-")) {
				System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
			} else if(op.equals("*")) {
				System.out.println(n1 + " X " + n2 + " = " + (n1 * n2));
			} else if(op.equals("/")) {
				System.out.println(n1 + " / " + n2 + " = " + (n1 + n2));
			} else if(op.equals("%")) {
				System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));					
			} else{
				System.out.println("없는 연산자 입니다. 다시 입력해주세요.");
			}
		 
		
		}
		
	}

}

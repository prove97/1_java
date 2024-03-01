import java.util.Scanner;

public class Array07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] chicken = {"후라이드", "양념", "간장", "고추바사삭", "청양마요", "파닭"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String dinner = sc.next();
		
//		for(int i = 0; i < chicken.length; i++) {
//			if(chicken[i].equals(dinner) == true) {
//				System.out.print(dinner +"치킨 배달 가능");
//				break;
//			} 
//			if(i == chicken.length-1){
//				System.out.print(dinner + "치킨은 없는 메뉴입니다.");
//			}
//		}

		boolean isTrue = false;
		
		for (int i = 0; i < chicken.length; i++) {
			if(chicken[i].equals(dinner)) {
				isTrue = true;
				break;
			}
		}
		if(isTrue == false) {
			System.out.print(dinner + "치킨은 없는 메뉴입니다.");
		} else { // isTrue == true
			System.out.print(dinner + "치킨 배달 가능");
		}
	}

}

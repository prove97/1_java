
public class LoopTest {

	public static void main(String[] args) {
		/*
		 * for (초기식; 조건식; 증감식){
		 * 
		 * while (조건식)
		 */
		
		System.out.println("반복문 시작전");
		
		
//		for(int i=0; i<5; ++i) {
//			System.out.println("반복문 실행 : " + i);
//		}

		int i = 0;
		while(i<5) {
			System.out.println("반복문 실행 : " + i);
			++i;
		}

			
		
		System.out.println("반복문 종료");
	}

}

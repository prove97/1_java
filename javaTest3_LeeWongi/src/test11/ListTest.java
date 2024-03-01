package test11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListTest {
	/*
	 * ArrayList는 java에서 제공하는 동적배열
	 * 배열과 유사하게 요소들을 순서대로 저장하여 인덱스를 통해 접근해 사용할 수 있다.
	 * 또한 제네릭을 통해서 해당 리스트에 저장하는 타입을 지정할 수 있다.
	 */

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();	
		Random rand = new Random();
		
		//명시한 사용 데이터를 list 에 기록한다.
		for(int i = 0; i < 10; i++) {
			list.add(rand.nextInt(100)+1); // 1부터 100까지의 수 10번 넣어줌
			if(i != 0) { // 처음 랜덤값 제외하고 
				while(list.get(i-1) == list.get(i)) { // 전 인덱스의 값과 비교해서 중복이면 다시 구함
					list.add(i, rand.nextInt(100)+1);
				}
			}
		}
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		// list 의 데이터를 내림차순 정렬한다.
//		new Decending().compare();	
		
		System.out.print("정렬전 : ");
		display(list);
		
		Collections.sort(list, new Decending());

		// display() 메소드를 호출한다.
		System.out.print("\n정렬후 : ");
		display(list);
	}
	
	public static void display(List<Integer> list) {
		for(Integer i : list) {
			System.out.print(i + " ");
		}
		
//		System.out.println("정렬후 : " + );
	}

}

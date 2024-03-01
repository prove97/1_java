package com.kh.test240205;

public class Run {

	public static void main(String[] args) {
		Human[] aGroup = new Human[5];
		
		aGroup[0] = new Human("김철수", 16);
		aGroup[1] = new Human("이철수", 17);
		aGroup[2] = new Human("박철수", 18);
		aGroup[3] = new Human("최철수", 20);
		aGroup[4] = new Human("정철수", 21);
		for(Human h: aGroup) {
			System.out.println(h);
		}
		System.out.println();
		Human[] tmp = new Human[aGroup.length + 1];
		tmp[5] = new Human("지철수", 22); // "지철수", 22 추가
		
		
		int i = 0;
		for(Human h: aGroup) {
			tmp[i++] = h;
		}
		for(Human h: tmp) {
			System.out.println(h);
		}

		System.out.println();
		//중간에 있는 2번째 인덱스값 삭제
		tmp[2] = null;
		for(Human h: tmp) {
			System.out.println(h);
		}
		
				
		
		
	}

}

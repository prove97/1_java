package test13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// Generics 적용된 맵 객체를 선언 할당한다.
		Map<String, Inventory> map = new HashMap<String, Inventory>();
		 
		
		// 상품명을 키로 사용하여 저장 처리 한다.
		Date[] date = new Date[3];
		date[0] = new Date(2016-1900, 3-1, 15);
		date[1] = new Date(2016-1900, 2-1, 25);
		date[2] = new Date(2016-1900, 1-1, 23);
		
		map.put("삼성 갤럭시S7", new Inventory("삼성 갤럭시S7", date[0], 30));
		map.put("LG G5", new Inventory("LG G5", date[1], 20));
		map.put("애플 아이패드 Pro", new Inventory("애플 아이패드 Pro", date[2], 15));
		
		// 맵에 기록된 정보를 연속 출력한다. EntrySet() 사용한다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		int i = 0; 
		for(Map.Entry<String, Inventory> entry: map.entrySet()) {
			System.out.println(entry.getKey() + ",\t" + sdf.format(date[i++]) + entry.getValue());
		}
		 
//		 map.entrySet(Set<Entry<String, Inventory>>);

		// 맵에 기록된 정보를 Inventory[] 로 변환한 다음
		Inventory[] inventory = new Inventory[3];
		
		
		 
		// 출고 날짜를 오늘 날짜로, 출고 수량은 모두 10개로 지정한다.예외처리함
		for(Map.Entry<String, Inventory> entry: map.entrySet()) {
			
			System.out.println(entry.getKey() + ",\t" + sdf.format(date[i++]) + entry.getValue());
			
			
		}
		
		
		
		// 변경된 Inventory[] 의 정보를 모두 출력한다.
		
	}

}

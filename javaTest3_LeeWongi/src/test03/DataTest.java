package test03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest {
	
	public static void main(String[] args) {
		
		Date today = new Date();
		Date birth = new Date(1987 - 1900, 5 - 1, 27);
		
		SimpleDateFormat formatBirth = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		SimpleDateFormat formatToday = new SimpleDateFormat("yyyy년 MM월 dd일");

//		String day = ""; 
//		switch (birth.getDay()) {
//		case 0:
//			day = "일요일";
//			break;
//		case 1:
//			day = "월요일";
//			break;
//		case 2:
//			day = "화요일";
//			break;
//		case 3:
//			day = "수요일";
//			break;
//		case 4:
//			day = "목요일";
//			break;
//		case 5:
//			day = "금요일";
//			break;
//		case 6:
//			day = "토요일";
//			break;
//		}
		
		System.out.println("생일 : " + formatBirth.format(birth));
		System.out.println("현재 : " + formatToday.format(today));
		System.out.println("나이 : " + (today.getYear() - birth.getYear()) + " 세");
	}

}

package test14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodTest {

	public static void main(String[] args) {
		// BufferedReader 에 대해 선언한다.
		
//		BufferedReader br = null;
		
		Goods goods = new Goods();
		
		
		//br 에 대한 키보드 입력스트림 객체 생성하고, 입력 처리하고 출력처리 한다.
		
		//try catch resource 문으로 작성한다.
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("다음 항목의 값을 입력하시오.");
			System.out.print("상품명 : ");
			goods.setName(br.readLine());
			System.out.print("가격 : ");
			goods.setPrice(Integer.parseInt(br.readLine()));
			System.out.print("수량 : ");
			goods.setQuantity(Integer.parseInt(br.readLine()));
			System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		System.out.println("입력된 결과는 다음과 같습니다.");
		System.out.println(goods.toString());		
		System.out.println("총 구매 가격 : " + (goods.getPrice() * goods.getQuantity()) + " 원");
		
	}

}

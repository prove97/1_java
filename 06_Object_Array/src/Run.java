
public class Run {
	/*
	 * 객체배열
	 * - 객체를 저장하는 배열로 일반적인 배열과 다르게
	 *   배열의 각요소가 참조변수로 이루어져 있다. -> 사용을 위해서는 각 요소마다 객체생성이 필요하다.
	 *   
	 *   
	 * [표현법]
	 * 클래스명[] 배열명 = new 클래스명[크기]; -> 크기가 n개인 참조변수 배열생성
	 * 배열명[index] = new 클래스명(); -> 각 인덱스 객체 생성
	 */
	public static void main(String[] args) {
		Human[] humanArr = new Human[3]; // -> [0, 0, 0]
		humanArr[0] = new Human("최지원", 21, 'i');
		humanArr[1] = new Human("이원기", 23, 'j');
		humanArr[2] = new Human("홍길동", 53, 'k');
		for(int i = 0; i < humanArr.length; i++) {
			humanArr[i].print(); 
		}
		
		Human[] humanArr2 = {new Human("최지원", 21, 'i'), new Human("이원기", 23, 'j'), new Human("홍길동", 53, 'k')};
		for(int i = 0; i < humanArr.length; i++) {
			humanArr2[i].print(); 
		}
		
	}

}

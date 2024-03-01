package com.kh.object;
/*
 * package
 * 클래스 간의 공간적 충돌이나 접근방법의 충돌을 막기 위해
 * 저장 위치를 구분하여 명확하게 접근할 수 있도록 해주는 것
 * 보통 네이밍 방법은 회사 도메인을 역으로 입력하다.
 * https://www.kh.com일 때 => com.kh.팀명[.또는 프로젝트명]
 * 
 * 
 * 1. 객체지향 언어 : "객체"를 "지향"하는 언어로 "객체중심"으로 돌아간다고 생각하면 됨
 * 
 * 2. 객체란 : 현실세계에 독립적으로 존재(목적이 있고 가치가 있고 의미가 있는 것)하는 모든것들을 의미(유형, 무형, 개념, ...)
 *           현실세계에서는 객체들간의 상호작용으로 돌아감
 *           
 * 3. 객체지향 프로그래밍 : 현실세계의 객체들간의 상호작용
 *                     프로그래밍을 통해서 가상세계로 구현하는 과정
 *                     
 * 4. 구현하고자 하는 프로그램 상의 필요한 객체들을 만들기 위해서(즉, 생성하기 위해서) 클래스라는 틀을 먼저 만들어야한다!!
 *    (클래스란? 각 객체들의 속성(데이터)들을 담아낼 그릇같은 존재)
 *    
 * 5. 추상화 과정
 *  1) 내가 구현하고자하는 프로그램에서 필요한 객체들을 생각해 볼 것
 *  2) 그 객체들이 가지는 공통적인 속성, 기능들을 추출할 것
 *  3) 추출한 것들을 가지고 내가 구현하고 했던 프로그램의 "실질적인 목적"에 맞춰 불필요한 속성, 기능을 제거할 것
 *  4) 그렇게 최종적으로 추려진 속성들을 어떤 자료형으로, 어떤 변수형으로 사용할 것인지 정의
 *  
 *  ex) 학생 관리 프로그램
 *      1) 학생 관련 객체(홍길동 학생, 김연아 학생, ...)
 *      2) 공통적인 속성 및 기능들(이름, 나이, 주소, 전화번호, 키, 몸무게, 달리기 속도, 머리색, 먹는다, 잔다, 화장실간다, ...)
 *      3) 학생 "인적사항"을 관리하는 프로그램 : 이름, 나이, 주소, 전화번호, 학년, 반
 *         학생 "성적"을 관리하는 프로그램 : 이름, 학년, 반, 국어점수, 영어점수, 수학점수
 *         학생 "건강"을 관리하는 프로그램 : 이름, 학년, 반, 키, 몸무게, 달리기 속도, 먹는다)
 *         
 *         결국 이름, 나이, 키라는 가정하에 
 *      4) 이름 : String name;
 *         나이 : int age;
 *         키 : double height;
 * 6. 위에 선정된 것들을 가지고 본격적인 프로그램을 할건데...
 *    1) "변수"만으로 프로그래밍을 한다면?
 *    
 *      *변수 = 하나의 자료형의 하나의 값만을 보관할 수 있음
 *      홀길동이라는 학생 객체를 만들어내기 위해서는 -> String name1 = "홍길동"; int age1 = 20; double height1 = 163.2;
 *      김말똥이라는 학생 객체를 만들어내기 위해서는 -> String name2 = "김말똥"; int age2 = 30; double height2 = 150.2;
 *      ... 등등의 수백명에 해당하는 학생들을 만들어야한다.
 *    
 *      문제점 -> 수백명에 해당하는 학생들을 만들 때 수천개의 변수가 필요하다.
 *      
 *    2) "배열"로 프로그래밍을 한다면? 
 *    
 *      *배열 = 하나의 자료형의 여러개의 값들을 보관할 수 있음
 *      
 *      학생들의 이름을 보관하는 배열 String[] name = {"홍길동", "김말똥", ...}
 *      학생들의 나이를 보관하는 배열 int[] age = {"20", "30", ...}
 *      ...
 *      
 *      어떤 문제가 있을까? -> 기존의 학생 정보를 지워야 할 때 뒤의 정보들을 앞으로 땡기는 과정을 진행해야하는데 혹시라도 실수하면 학생의 정보가
 *                        뒤바뀔 수 있다. 또한 새로운 학생의 정보를 기록해야할 때 새로운 크기의 배열을 만들어서 기존의 배열로부터 복사한 후 추가해줘야한다.
 *                        
 *    3) 그래서 나온 개념은 구조체
 *    
 *      *구조체 - 여러개의 자료형에 여러개의 값들을 보관할 수 있다.
 *      String값도 보관하고, int값도 보관할 수 있고 동시에 double도 함께 자료형에 상관없이 여러개의 값을 동시에 저장할 수 있다.
 *      -> 나만의 자료형의 집합 만든다. -> 자바에서는 이러한 구조체 개념을 조금 더 확장해서 '클래스'라는 개념을 만들었다.
 *      
 * *캡슐화 : 추상화를 통해서 정의된 속성들과 기능들을 하나로 묶어 관리하는 기법중 하나로 
 *         클래스에서 가장 중요한 목적인 "데이터의 접근제한(정보은닉)"을 원칙으로
 *         외부로부터의 "데이터의 접근을 막고"
 *         대신 "데이터를 간접적으로 처리(값을 대입, 값을 돌려주거나)"할 메소드들을 클래스 내부에 작성해서 관리하는 것   
 *    
 */			

public class Run {

	public static void main(String[] args) {
//		//클래스를 이용해서 학생 객체 만들어 보기
//		
//		//자바에서 객체로 만들기 위해서는 new라는 키워드를 통해 메모리 공간을 할당해줘야한다.
//		Student choi = new Student("최지원", 17, 187.2);
//		Student kim = new Student("김소망", 20, 165.5);
//		
//		choi.print();
//		kim.print();
//		
//		// . : 해당 객체에 접근할때 사용함
//		// 직접 접근을 통해 값을 가져온다.
//		choi.setName("최배달");
//		choi.setAge(90);
//		choi.print();
//		
//		System.out.println("안녕하세요. " + choi.getAge() + "살 "  + choi.getName() + "입니다.");
//		
//		choi.print();
//		choi.print("남자");
//		
//		System.out.println(choi.cnt);
//		System.out.println(Student.cnt);

		NumberPrinter.showDouble(0.3);
	}

}

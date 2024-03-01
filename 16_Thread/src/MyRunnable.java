/*
 * 쓰레드 생성 방법1. Runnable의 추상메소드 run을 구현하는 객체를 만든다.
 */
public class MyRunnable implements Runnable{ //Runnable 인터페이스 구현해서 run()메소드 오버라이딩

	@Override
	public void run() {
		int n1 = 10;
		int n2 = 20;
		//currentThread() : 지금 실행하고 있는 쓰레드의 정보를 반환한다.
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + (n1 + n2));
		
	}
}

package test09;

public class PlaneTest {

	public static void main(String[] args) {
		
		// Airplane 과 Cargoplane 객체 생성
		Plane air = new Airplane("L747", 1000);
		Plane cargo = new Cargoplane("C40", 1000);
		
		// 생성된 객체의 정보 출력
		System.out.println("Plane\t\tfuelSize");
		System.out.println("------------------------");
		System.out.println(air);
		System.out.println(cargo);
		
		// Airplane 과 Cargoplane 객체에 100 씩 운항
		air.flight(100);
		cargo.flight(100);
		
		// 100 운항 후 객체 정보 출력
		System.out.println();
		System.out.println("Plane\t\tfuelSize");
		System.out.println("------------------------");
		System.out.println(air);
		System.out.println(cargo);
		
		//Airplane 과 Cargoplane 객체에 200 씩 주유
		air.refuel(200);
		cargo.refuel(200);
		
		// 200 주유 후 객체 정보 출력
		System.out.println();
		System.out.println("Plane\t\tfuelSize");
		System.out.println("------------------------");
		System.out.println(air);
		System.out.println(cargo);
	}

}

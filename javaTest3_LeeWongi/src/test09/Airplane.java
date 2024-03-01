package test09;

public class Airplane extends Plane{

	public Airplane() {
		super();
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	@Override
	public void flight(int distance) { //운항
		this.setFuelSize(this.getFuelSize() - (distance*3));
	}
}

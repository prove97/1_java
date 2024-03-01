package test09;

public class Cargoplane extends Plane {

	public Cargoplane() {
		super();
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	@Override
	public void flight(int distance) { //운항
		this.setFuelSize(this.getFuelSize() - (distance*5));
		
	}
}

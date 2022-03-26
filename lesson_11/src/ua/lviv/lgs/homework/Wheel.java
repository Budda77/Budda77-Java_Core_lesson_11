package ua.lviv.lgs.homework;

public class Wheel {
	
	private int wheelRadius;
	private String material;
	
	public Wheel() {

	}
	
	public Wheel(int wheelRadius, String material) {
		super();
		this.wheelRadius = wheelRadius;
		this.material = material;
	}

	@Override
	public String toString() {
		return "[wheelRadius=" + wheelRadius + ", material=" + material + "]";
	}
	
	
	
	

}

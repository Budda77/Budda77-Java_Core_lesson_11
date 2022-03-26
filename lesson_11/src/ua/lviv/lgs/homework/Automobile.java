package ua.lviv.lgs.homework;

public class Automobile {
	
	private Auto auto; // = new Auto();
	private Engine engine; //= new Engine();
	private Wheel wheel; //= new Wheel();
		

	public Automobile(Auto auto, Engine engine, Wheel wheel) {
		super();
		this.auto = auto;
		this.engine = engine;
		this.wheel = wheel;
	}


	@Override
	public String toString() {
		return "Automobile [Auto=" + auto + ", Engine=" + engine + ", Wheel=" + wheel + "]";
	}


	
	

}

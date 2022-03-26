package ua.lviv.lgs.homework;

public class Auto {
	
	private int horsepower;
	private int yearOfManufacture;
	private Engine engine; 
	private Wheel wheel;
	
	public Auto() {

	}
	
	public Auto(int horsepower, int yearOfManufacture) {
		super();
		this.horsepower = horsepower;
		this.yearOfManufacture = yearOfManufacture;
	}
	
		

	public Auto(int horsepower, int yearOfManufacture, Engine engine, Wheel wheel) {
		super();
		this.horsepower = horsepower;
		this.yearOfManufacture = yearOfManufacture;
		this.engine = engine;
		this.wheel = wheel;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	@Override
	public String toString() {
		return "Auto [horsepower=" + horsepower + ", yearOfManufacture=" + yearOfManufacture + ", engine=" + engine
				+ ", wheel=" + wheel + "]";
	}

	/*@Override
	public String toString() {
		return "[horsepower=" + horsepower + ", yearOfManufacture=" + yearOfManufacture + "]";
	}
	*/
	
	
	
	
}

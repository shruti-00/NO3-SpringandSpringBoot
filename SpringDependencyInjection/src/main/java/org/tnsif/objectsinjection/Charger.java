package org.tnsif.objectsinjection;

public class Charger {
	
	//private data members
	private String brand;
	private int voltage;
	private String Type;
	
	//DI using setters method
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	public void setType(String type) {
		Type = type;
	}
	
	//toString
	@Override
	public String toString() {
		return "Charger [brand=" + brand + ", voltage=" + voltage + ", Type=" + Type + "]";
	}
	
	
	
	
	
	

}

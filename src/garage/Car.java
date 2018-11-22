package garage;

public class Car extends Vehicle {
	
	//ATTRIBUTES//
	private String manufacturer;
	private String model;
	private String colour;
	
	//CONSTRUCTORS//
	public Car(String manufacturer, String model, String colour,
			int ID, int wheels, int weight) {
		super(ID, wheels, weight);
		this.manufacturer = manufacturer;
		this.model = model;
		this.colour = colour;
		
	}
	//METHODS//
}

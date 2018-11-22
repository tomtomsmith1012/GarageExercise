package garage;

import java.util.ArrayList;

public class Garage {

	public static void Garage(String args) {

		Car XC60 = new Car("Volvo", "XC60", "White", 1, 4, 500);
		Lorry XT = new Lorry("Scania", "XT", "Black", 2, 8, 4000);
		Motorcycle Monster = new Motorcycle("Ducati", "Monster", "Orange,", 3, 2, 100);

		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(XC60);
		vehicles.add(XT);
		vehicles.add(Monster);
	}

}

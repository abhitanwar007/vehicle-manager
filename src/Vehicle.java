
public class Vehicle {
	
	public static void main(String[] args) {
		PetrolEngine pe = new PetrolEngine();
		pe.start();
		DieselEngine de = new DieselEngine();
		de.start();
	}
}

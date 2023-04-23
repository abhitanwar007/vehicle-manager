
public class Vehicle {
	
	public static void main(String[] args) {
		PetrolEngine pe = new PetrolEngine();
		pe.start();
		pe.stop();
		
		DieselEngine de = new DieselEngine();
		de.start();
		de.stop();
		
		ElectricEngine ee = new ElectricEngine();
		ee.start();
		
	}
}

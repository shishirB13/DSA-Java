package src.OOPS.Abstraction;

public class Repairshop {
public static void repaircar(WagonR car) {
	System.out.println("Car is repaired");
}
public static void repaircar(Audi car) {
	
}
	public static void main(String[] args) {
	WagonR wagonr = new WagonR();
	Audi audi = new Audi();
	extracted(wagonr, audi);

	}
	private static void extracted(WagonR wagonr, Audi audi) {
		repaircar(wagonr);
		repaircar(audi);
	}

}

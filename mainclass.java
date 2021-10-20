package OOPS;
class cat {
	boolean hasfur;
	String color,breed;
	int legs , eyes;
	public void walk() {
		System.out.println("Cat is walking");
	}
	public void eat()  {
		System.out.println("Cat is eating");
	}
	public void description() {
		System.out.println("my cat has " + legs +"legs and " + eyes +"eyes");
	}
	
	
}
public class mainclass {

	public static void main(String[] args) {
	cat cat1 = new cat();
	cat cat2 =new cat();
	cat1.legs=4;
	cat1.eyes = 2;
	
cat1.description();
	}

}

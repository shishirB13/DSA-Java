package methods;

public class Passbyvalue {

	public static void main(String[] args) {
		int c = 34 ;
		int d = 20;
		swap(c,d);
		System.out.println(c + "  "+ d);
		Dog c1= new Dog();
c1.legs = 4;
Dog d1 = new Dog();
d1.legs = 3;
swap(c1,d1);
System.out.println( c1.legs +"and" + d1.legs);

	}
static void swap(int a , int b) {
	int temp = a;
	a = b;
	b = temp;
}
static void swap (Dog a , Dog b) {
	Dog temp = a;
	a=b;
	b=temp;
	
}
}
class 	Dog {
	int legs ;
	
}

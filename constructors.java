package OOPS;
class vehicle{
	int wheels;
	int headlights;
	String colour;
	
	vehicle(int wheels) {
		this.wheels = wheels;
		headlights =2;
	}
	vehicle( int wheels , String colour){
		this.wheels = wheels;
		this.colour = colour;
      }
	}
public class constructors {
	constructors(){
		System.out.println("object is now created");
	}

	public static void main(String[] args) {
vehicle car = new vehicle(4);
vehicle bike = new vehicle(2);
vehicle eRikshaw = new vehicle(3, "Yellow");
System.out.println(bike.wheels +"wheels and colour =" + eRikshaw.colour);

	}

}

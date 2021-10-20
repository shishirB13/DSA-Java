package methods;

public class Introduction {

	public static void main(String[] args) {
		
int firstno = 34;
int secondno = 20;
int result = maxof(firstno,secondno);
maxof(100,20);
System.out.println(result);
sayHi();
	}
	static int  maxof(int a,int b) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
		static void sayHi() {
			System.out.println("Hi");
			
		}

}


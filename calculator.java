package Conditionalstatements;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner sc  =  new Scanner(System.in);
		System.out.println("Enter first no.");
		int a = sc.nextInt();
		
		System.out.println("Enter second no.");
		int b = sc.nextInt();
		
		System.out.println("Enter the operation");
		sc.nextLine();
		int result = 0;
		char operation = sc.nextLine().charAt(0);
		switch(operation) {
		case '+':
			result = a+b;
			break;
		case'-':
			result = a-b;
			break;
		case '*':
			result = a*b;
			break;
			case '/':
				result = a/b;
				break;
				default :
				System.out.println("Invalid operation");
		
		}
		System.out.println("The result is "+ result);
		
		
		// TODO Auto-generated method stub

	}

}

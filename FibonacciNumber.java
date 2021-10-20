package Algorithms;

public class FibonacciNumber {

	public int fib(int n) {
		int [] table = new int[n+1];// 0-->n
		table[0]= 0;
		table[1]= 1;
		
		for(int i = 2; i<=n; i++) {
			table[i] = table[i-1] + table[i-2];			
		}
		return table[n];		
		                   
	}
	
	public static void main(String[] args) {
		FibonacciNumber fb = new FibonacciNumber();
		System.out.println("the 6th fibonacci number is "+ fb.fib(6));

	}

}

package Arrays;

public class Selectionsort {
 
	public static void main (String [] args) {
		int a[] = {3,1,-2, 7,4,0};
		int n = a.length;
		for (int i=0 ; i< n-1; i++) {
			int minInd = i;
			for (int j = 0; j< n-1;  j++) {
				if (a[j] < a[minInd]) {
					
				}
			}
			int temp = a[i];
			a[i] =a[minInd];
			a[minInd]= temp;
			
					
		}
		for(int e: a) {
			System.out.print(e + " ");
		}
	}
}

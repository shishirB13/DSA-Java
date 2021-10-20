package DataStructures;

public class Arrays {

	
	public static void reverse (int [] numbers, int start, int end) {
		while(start<end) {
			int temp = numbers[start];
			numbers[start]= numbers[end];
			numbers[end]= temp;
			start++;
			end--;
		}
	}
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public int findminimum(int []arr) {
		        if(arr ==null || arr.length == 0)     { // edge case
		        	throw new IllegalArgumentException("Invalid Input");
		        }
		        int min = arr[0]; // min will hold the minimum of array
		        for(int i =1; i<arr.length;i++) {
		        	if (arr[i]<min) {
		        		min = arr[i];
		        	}
		        }
		        return min;
	}
	
	
	public void arrayDemo(){
		int[]myarray = new int[5]; // default values
	//	printArray myarray;
		myarray[0] =5;
		myarray[1] =2;
		myarray[2] =8;
		myarray[3] =7;
		printArray(myarray);
		System.out.println(myarray.length);
	}
	public static void movezeros(int[]arr , int n) {
		int j = 0;// zeroth element
		for(int i =0; i<n; i++) {    // non zero elements
			if(arr[i]!=0 && arr[j] ==0) {
				int temp = arr[i];
				arr[i] =arr[j];
				arr[j] = temp;
			}
			if(arr[j]!=0) {
				j++;
			}
		}
	}
	public int[] resize(int[]arr, int capacity) {
		int[] temp = new int[capacity];
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];	
		}
		arr=temp;			
		return arr;
	}

	public static void main(String[] args) {
		Arrays arrutil = new Arrays();
	arrutil.arrayDemo();
// int[] numbers = {2,11,5,10,7,8};
// printArray(numbers);
 //reverse(numbers,0, numbers.length -1);
 //printArray(numbers);
//int[] arr = {8,1,0,2,1,0,3};
Arrays ma = new Arrays();
//printArray(arr);
//movezeros(arr, arr.length);
//printArray(arr);
 int[] original = new int[] {8,1,0,2,1,0,3};
 System.out.println("Size of original array-"+ original.length);
	arrutil.resize(original,10);
	System.out.println("Size of original array after resize-"+original.length);
	}

}

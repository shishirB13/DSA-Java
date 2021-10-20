package DataStructures;

public class CircularSinglyLinkedList {
	private Listnode last;
	private int length;
	private class Listnode{
		private Listnode next;
		private int data;
		
		public Listnode(int data) {
			this.data = data;
		}
	}
public CircularSinglyLinkedList() {
	last = null;
	length = 0;
	
}
public int length() {
	return length;
}
public boolean isEmpty() {
	return length == 0;
}
public void createCircularLinkedList() {
	Listnode first = new Listnode(1);
	Listnode second = new Listnode(4);
	Listnode third = new Listnode(7);
	Listnode fourth = new Listnode(8);
	
	first.next = second;
	second.next = third;
	third.next= fourth;
	fourth.next = first;
	last = fourth;
	
}
public void display() {
	if(last==null) {
		return;
	}
	Listnode first = last.next;
	while(first !=last) {
		System.out.println(first.data+ " ");
		first= first.next;
	
	}
	System.out.println(first.data);
}
public void insertFirst(int data) {
	Listnode temp = new Listnode(data);
	if(last ==null) {
		last = temp;
	}else {
		temp.next = last.next;
	}
	last.next = temp;
	length++;
}
public void insertlast(int data) {
	Listnode temp = new Listnode(data);
	if(last==null) {
		last = temp;
		last.next = last;
	}else {
		temp.next = last.next;
		last.next= temp;
		last = temp;
	}
	length++;
}
public int removefirst() {
	if(isEmpty()) {
		System.out.println("CSLL is empty");
	}
	Listnode temp = last.next;
	int result = temp.data;
	if(last.next == last) {
		last=null;
	}else {
		last.next = temp.next;
	}
	//temp.next= null;
	length--;
	return result;
		
}
	public static void main(String[]args) {
		CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
		csll.createCircularLinkedList();
		csll.insertFirst(10);
		csll.insertlast(9);
		csll.display();
		csll.removefirst();
		System.out.println(csll.removefirst());
		csll.display();
		
	}

}

package DataStructures;

public class DoublyLinkedList {

	private Listnode head;
	private Listnode tail;
	private int length;
	
	private class Listnode {
		private int data;
		private Listnode next;
		private Listnode previous;
		
		public Listnode(int data) {
			this.data = data;
		}
	}
	public DoublyLinkedList() {
		this.head= null;
		this.tail = null;
		this.length= 0;
	}
	public boolean isEmpty() {
		return length == 0; //head==null
	}
	public int length() {
		return length;
	}
public void displayforward() {
	if (head==null) {
		return;
	}
	Listnode temp = head;
	while(temp!=null) {
		System.out.println(temp.data+"-->");
		temp=temp.next;
	}
	System.out.println("null");
}
public void displaybackward() {
	if (tail==null) {
		return;
	}
	Listnode temp=tail;
	while(temp==null) {
		System.out.println(temp.data+"-->");
		temp=temp.next;
	}
	System.out.println("null");
}
public void insertFirst(int value) {
	Listnode newNode = new Listnode(value);
	if(isEmpty()) {
		tail = newNode;
	}else {
		head.previous = newNode;
		
	}
	newNode.next = head;
	head= newNode;
	length ++;
	
	
}
public void insertlast(int value) {
	Listnode newnode = new Listnode(value);
	if(isEmpty()) {
		head =newnode;
		
	}else {
		tail.next =newnode;
		newnode.previous = tail;
	}
	tail = newnode;
	length++;
	
}
public Listnode deletefirst() {
	if(isEmpty()) {
	 System.out.println("No such element");	 
	}
	Listnode temp = head;
	if(head== tail) {
	tail = null;
		
	}else {
		head.next.previous = null;
	}
	head = head.next;
	temp.next = null;
	length--;
	return temp;
}

public Listnode deletelast() {
	if(isEmpty()) {
		System.out.println("No such element");
	}
	Listnode temp = tail;
	if(head==tail) {
		head = null;
	}else {
		tail.previous.next =null;
	}
	tail  = tail.previous;
	temp.previous=null;
	length--;
	return temp;
}
public static void main(String[] args) {
	DoublyLinkedList dll = new DoublyLinkedList();
	dll.insertlast(1);
	dll.insertlast(10);
	dll.insertlast(12);
	dll.displayforward();
	
	dll.deletelast();
	dll.displayforward();
}
}

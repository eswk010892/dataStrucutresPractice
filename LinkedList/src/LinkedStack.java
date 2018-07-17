
public class LinkedStack<Item> implements Stack<Item> {
private Node head;
private int size;
private class Node{
	Item item;
	Node next;
}
public LinkedStack(){
	size = 0;
	head = null;
}
public boolean isEmpty(){
	return (size==0);
}
public int size(){
	return size;
}
public void push(Item item){
	Node oldHead = head;
	head = new Node();
	head.item = item;
	head.next = oldHead;
	size++;
	}
public Item pop(){
	Item item = head.item;
	head = head.next;
	size--;
	return item;
}
public static void main (String []args){
	LinkedStack<Integer> stack = new LinkedStack<Integer>();
	stack.push(1);
	stack.push(2);
	stack.push(3);
	stack.push(4);
	stack.push(5);
	stack.push(6);
	System.out.println("size of thr array : "+stack.size());
	
	
	
	
}


}

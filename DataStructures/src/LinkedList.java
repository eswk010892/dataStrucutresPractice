
public class LinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public void printList(){
		Node n = head;
		while(n != null){
			System.out.print(n.data + " ");
			n = n.next;
		}
		}
	public void push (int d){
		//create the new node to be inserted
		Node n = new Node(d);
		//make current head as the next node of new node
		n.next = head;
		//make the new node the head
		head = n;
	}
	//inserting the node after as given node with complexity O(1)
	public void insertAfter(Node prev_node,int new_data){
		//check for the empty node
		if(prev_node == null){
			System.out.println("Node cannot be null");
			return;
		}
		
		Node n = new Node(new_data);
		//make the next of prev_node as the next of the new node
		n.next = prev_node.next;
		//make the new node as the next of the prev_node
		prev_node.next = n;
	}
	void append(int new_data){
		Node n = new Node(new_data);
		if(head == null){
			head = n;
			return;
		}
		Node last = head;
		while(last.next != null){
			last = last.next;
			}
		last.next = n;
	}
void delete(int key){
	Node temp = head,prev = null;
	if(temp != null && temp.data == key){
		head = temp.next;
		return;
	}
	while(temp!=null && temp.data != key){
		prev = temp;
		temp = temp.next;
	}
	if(temp == null){
		return;
	}
	prev.next = temp.next;
	
}
void deletePos(int position){
	Node temp = head;
	if (head == null)
		return;
	if(position == 0)
	{
		head = temp.next;
		return;
	}
	for(int i = 0;i<position-1;i++){
		temp = temp.next;
	}
	if(temp == null || temp.next == null)
		return;
	Node next = temp.next.next;
	temp.next = next;
		
}
public int getCount(){
	Node temp = head;
	int count =0;
	while(temp.next != null){
		count++;
		temp =temp.next;
	}
	return count;
	
}
public void swap(int x,int y){
	if(x==y)
		return;
	Node prevX = null,currX = head;
	while(currX != null&&currX.data != x){
		prevX =currX;
		currX = currX.next;
	}
	Node prevY = null,currY = head;
	while(currY != null && currY.data != y){
		prevY = currY;
		currY = currY.next;
	}
	if(currX == null || currY == null){
		return;
	}
	if(prevX!=null){
		prevX.next = currY;
	}
	else{
		head = currY;
	}
	if(prevY!=null){
		prevY.next = currX;
	}
	else{
		head = currX;
	}
	Node next = currX.next;
	currX.next = currY.next;
	currY.next = next;
}
Node reverse(Node node){
	Node prev = null,current = node,next =null;
	while(current != null){
		next =current.next;
		current.next =prev;
		prev = current;
		current = next;
	}
	node = prev;
	return node;
}
	//****************************************************

public static void main(String[] args) {
		
     LinkedList llist = new LinkedList();
     llist.head = new Node(1);
     Node second = new Node(2);
     Node third = new Node(3);
  
	llist.head.next = second;
	second.next = third;
	llist.swap(1, 2);
	
	System.out.println(llist.reverse(second));
	}

}

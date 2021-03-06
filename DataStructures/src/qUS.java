import java.util.Stack;
public class qUS {

	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	void enqueue(int data){
		s1.push(data);
	}
	//helper function to dump all the elements from s1 to s2
	void transfer(){
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
    }
	boolean isEmpty(){
		return (s1.isEmpty()&&s2.isEmpty());
	}
	//made dequeue costly where it switches all the elements from s1 to s2 so the oldest element is on the top to achieve queue behavior
	int dequeue(){
		if(this.isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		}
		if(s2.isEmpty())
			this.transfer();
			return s2.pop();
		}
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    qUS q  = new qUS();
    q.enqueue(1);
    q.enqueue(10);
    q.enqueue(100);
    while(!q.isEmpty()){
    	System.out.println(q.dequeue());
    }
	}

}

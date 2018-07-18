import java.util.Stack;
public class qUSS {
	Stack<Integer> stack = new Stack<>();
	void enqueue(int data){
		stack.push(data);
	}
	boolean isEmpty(){
		return this.stack.isEmpty();
	}
    int dequeue(){
    	if(stack.isEmpty()){
    		System.out.println("queue is empty");
    		return -1;
    	}
    	int x = stack.pop(),top;
    	if(stack.isEmpty()){
    		return x;
    	}
    	else{
    		top = this.dequeue();
    		this.enqueue(x);
    		return top;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		qUS q  = new qUS();
	    q.enqueue(1);
	    q.enqueue(5);
	    q.enqueue(10);
	    while(!q.isEmpty()){
	    	System.out.println(q.dequeue());
	    }
		}

}

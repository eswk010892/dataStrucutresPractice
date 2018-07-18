import java.util.Stack;
public class minStack {
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> minstack = new Stack<>();
	public void pushour(int k){
		//push on both stacks if they're empty
		if(stack.isEmpty()){
			stack.push(k);
			minstack.push(k);
		}
		else{
			//push on minStack only if the incoming element is less than the peek
			int x = minstack.peek();
			if(k<=x){
				minstack.push(k);
			}
			stack.push(k);
		}
	}
	public int popour(){
		int x = stack.pop();
		int y = minstack.pop();
		if(y!=x){
			minstack.push(y);
		}
		return x;
	}
	public int min(){
		return minstack.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minStack m = new minStack();
		m.pushour(3);
		m.pushour(2);
		m.pushour(1);
		m.pushour(4);
		m.pushour(5);
		System.out.println("minimum value is : "+m.min());

	}

}

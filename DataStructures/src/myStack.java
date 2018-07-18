//Implementing stack using array list
import java.util.EmptyStackException;
public class myStack {
private int size;
private int top;
private long stackArray[];
public myStack(int size){
	this.size = size;
	stackArray = new long[size];
}
public void push(int x){
	if(isFull()){
		throw new StackOverflowError("stack is full");
	}
	else{
		stackArray[top] = x;
		top++;
	}
}
public long pop(){
	if(isEmpty() == true){
		throw new EmptyStackException();
	}
	return stackArray[--top];
}

public boolean isFull(){
	if (top == size){
		return true;
	}
	else{
		return false;
	}
}
public boolean isEmpty(){
	if(top == 0){
		return true;
	}
	else{
		return false;
	}
}
public int size(){
	return top;
}
//************************************************
	public static void main(String[] args) {
		myStack stack1 = new myStack(5);
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		stack1.push(5);
		System.out.println("size of the array after push operations : "+stack1.size);
		while(!stack1.isEmpty()){
			System.out.printf(" %d",stack1.pop());
		}
	}

}

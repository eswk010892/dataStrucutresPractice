
public class stacksArray {
	int size,top1,top2;
	int arr[];
	public stacksArray(int n){
		arr = new int[n];
		size = n;
		int top1 = -1;
		int top2 = size;
		
	}
	public void push1(int x){
		if(top1< (top2-1)){
			++top1;
			arr[top1] = x;
			
		}
		else{
			System.out.println("Stack overflow1");
			System.exit(1);
		}
	}
    public void push2(int x){
    	if (top1<(top2-1)){
    		--top2;
    		arr[top2] = x;
    		
    	}
    	else{
    		System.out.println("Stack overflow2");
    		System.exit(1);
    	}
    }
    public int pop1(){
    	if(top1<0){
    		System.out.println("Stack underflow");
    		System.exit(1);
    	}
    	else{
    		int x = arr[top1];
    		top1--;
    		return x;
    	}
    	return 0;
    }
    public int pop2(){
    	if(top2<size){
    		int x = arr[top2];
    		top2++;
    		return x;
    	}
    	else{
    		System.out.println("Stack underflow");
    		System.exit(1);
    	}
    	return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stacksArray sa = new stacksArray(5);
        sa.push1(5);
        sa.push2(10);
        sa.push2(15);
        sa.push1(11);
        sa.push2(7);
        System.out.println("Popped element from" +
                           " stack1 is " + sa.pop1());
        sa.push2(40);
        System.out.println("Popped element from" +
                         " stack2 is " + sa.pop2());

	}

}

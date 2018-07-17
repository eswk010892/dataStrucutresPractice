import java.util.Stack;

public class Postfix {
	  static Stack<Integer> s = new Stack<>();
	 
	static int postfix(String expression){
		for(int i = 0;i<expression.length();i++){
			char c = expression.charAt(i);
			if(Character.isDigit(c))
				s.push(c-0);
			else{
				int val1 = s.pop();
				int val2 = s.pop();
			
			switch(c){
			case '+':
				s.push(val2+val1);
				break;
			case '-':
				s.push(val2-val1);
				break;
			case '/':
				s.push(val2/val1);
				break;
			case '*':
				s.push(val2*val1);
				break;
			}
			}
		}
		return s.pop();
	}

	public static void main(String[] args) {
		String exp = "231*+9-";
		System.out.println(postfix(exp));

	}

}

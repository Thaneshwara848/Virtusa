package comE;

import java.util.Stack;

public class Demo {
	 public static void main(String[] args)
	    {
	        // Create a new stack
	        Stack s = new Stack<>();

	        // Push elements onto the stack
	        s.push(1);
	        s.push(2);
	        s.push(3);
	        s.push(4);
	        System.out.println(s);
	        s.pop();
	        System.out.println(s);
	        System.err.println(s.peek());
	        System.out.println(s.pop());
	        System.out.println(s);
	        
//	        			LIFO : last in FirstOUT 
//	        // Pop elements from the stack
//	        while (!s.isEmpty()) {
//	            System.out.println(s.pop());
//	        }
	    }
}

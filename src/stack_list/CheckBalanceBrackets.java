package stack_list;

import java.util.Scanner;
import java.util.Stack;

public class CheckBalanceBrackets {
	
	public static boolean isBalanced(String expression) {
		
        Stack<Character> stack = new Stack<Character>();

      // Traversing the Expression
        for(int i=0; i<expression.length(); i++){
            char x = expression.charAt(i);

            if(x=='[' ||x=='{' || x=='(' ){
                stack.push(x);
                continue;
            }

            if(stack.isEmpty()){
                return false;
            }
            
// Use switch statement to pop element from stack and if it is '(', '[' or '{', return false
           
            char check;
            switch(x) {
             case')':
            	check = stack.pop();
            	if(check=='{' || check=='[') {
            		return false;
            	}
            	
            	break;
             case'}':
            	 check = stack.pop();
            	 if(check=='(' || check=='[') {
            		 return false;
            	 }
            	 
            	 break;
             case']':
            	 check = stack.pop();
            	 if(check=='(' || check=='{') {
            		 return false;
            	 }
            	 
            	 break;
            
            }
            
//         // Check Empty Stack
//            return (stack.isEmpty()); 
            
        }
        
        return (stack.isEmpty());
        
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String expression = sc.next();
		
		System.out.println(isBalanced(expression));
			

	}

}

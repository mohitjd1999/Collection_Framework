package stack_list;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
	
//	public static void reverse(Stack<Integer> helper) {
//		if(helper.isEmpty()) {
//			return;
//		}
//		
//		int temp = helper.pop();	
//		reverse(helper);
//		reverseStack(input, helper);
//	}
	
	public static void reverseStack(Stack<Integer> input, Stack<Integer> helper) {
		
//		if(input.size()==0 || input.size()==1) {
//			System.out.println(input);
//		}
		
		for(int i=0; i< input.size(); i++) {
			int temp = input.peek();
			
			input.pop();
			helper.push(temp);
		}

		
	}
	
	public static Stack<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		Stack<Integer> input = new Stack<>();
		
		if(size==0) {
			return input;
		}
		
		int []values = new int[size];
		
		for(int i=0; i<size; i++) {
			values[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			input.push(values[i]);
		}
		
		return input;
	}

	public static void main(String[] args) {
		
		Stack<Integer> input = takeInput();
		Stack<Integer> helper = new Stack<>();
		
		reverseStack(input, helper);
		
		while(!input.isEmpty()) {
    		System.out.print(input.pop() + " ");
    	}
		
		

	}

}

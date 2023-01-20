package stack_list;
import java.util.Stack;

public class Stack_list {

	public static void main(String[] args) {
		
		Stack<String> animals = new Stack<>();
		
		animals.push("Lion");                       // Adding the Item
		animals.push("Beer");
		animals.push("Giraffe");
		animals.push("Elephant");
		
		System.out.println(animals);
		
		System.out.println(animals.peek());         // get the top Item
		
		animals.pop();                              // Remove the top Item
		System.out.println(animals); 
		
		System.out.println(animals.peek()); 

	}

}

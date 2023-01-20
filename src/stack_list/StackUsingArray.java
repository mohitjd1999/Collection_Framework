package stack_list;

public class StackUsingArray {
	
	private int data[];
	private int topIndex;      // index of the top most element of the stack.
	
	public StackUsingArray() {
		data = new int[2];
		topIndex = -1;
	}
	
	public StackUsingArray(int size) {       // dynamic array
		data = new int[size];
		topIndex = -1;
	}
	
	public int size() {                        // check the size of stack
		int arraySize = topIndex+1;
		return arraySize;
	}
	
	public boolean isEmpty() {                  // check the stack is empty or not
//		if(topIndex==-1) { 
//			return true;
//		}else {
//			return false;
//		}
		
		return topIndex == -1;
		
	}
	
	public void push(int element) {      // Insert the element
		
		if(topIndex == data.length-1) {                           // If stack is full
//			StackFullException e = new StackFullException();
//			throw e;
//			throw new StackFullException();
			
			doubleCapacity();
		}
		
		 topIndex++;
		 data[topIndex] = element;
	}
	
	private void doubleCapacity() {
		
		System.out.println("Double Capacity");
		
		int temp[] = data;
		
		data = new int[2 * temp.length];
			
		for(int i=0; i<temp.length; i++) {
			data[i] = temp[i];
		}
	}
	
	public int pop() throws StackEmptyException{            // remove the top element
		
		if(topIndex == -1) {
			throw new StackEmptyException();
		}
		
		int temp = data[topIndex];
		topIndex--;
		
		return temp;
	}
	
	public int top() throws StackEmptyException {        // see the top element
		
		if(topIndex == -1) {
			throw new StackEmptyException();
		}
		
		
//		int peek = data[topIndex];
//		return peek;
		
		return data[topIndex];
	}
	
	
}

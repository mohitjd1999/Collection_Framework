package array_list;

public class DynamicArray {

	private int data[];
	private int nextElementIndex;
//	private int size;
	
	public DynamicArray() {
		data = new int[5];
		nextElementIndex = 0;
	}
	
	public int size() {
		return nextElementIndex;
	}
	
	public boolean isEmpty() {
		return nextElementIndex==0;
	}	
	
	public int get(int i) throws IndexOutOfBoundException {
		if(i>= nextElementIndex) {
			throw new IndexOutOfBoundException();
		}
		return data[i];
	}
	
	public int set(int i, int element) {
		if(i>= nextElementIndex) {
			return data[i];
		}
		
		return data[i] = element;
	}
	
	public void doubleCapacity() {
		int temp[] = data;
		data = new int[2* temp.length];
		
		for(int i=0; i<temp.length; i++) {
			data[i] = temp[i];
		}
		
	}
	
	public void add(int element) {
		if(nextElementIndex == data.length) {
			doubleCapacity();
		}
		
		data[nextElementIndex] = element;
		nextElementIndex++;
		
	}
	
	public int removeLast() throws IndexOutOfBoundException{
		if(nextElementIndex<=0) {
			throw new IndexOutOfBoundException();
		}
		
		int temp = data[nextElementIndex -1];		
		nextElementIndex--;
		
		return temp;
	}
	
	
	
}

package queue_list;

public class QueueUsingArray {
	
	private int data[];
	private int front;   // index of element of the front of the queue
	private int rear;	 // index of element of the rear of the queue
	private int size;
	
	public QueueUsingArray() {
		data = new int[5];	
		front = -1;
		rear = -1;
	}

	public QueueUsingArray(int capacity) {
		data = new int[capacity];	
		front = -1;
		rear = -1;
	}

	public int size() {
		return size;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2*temp.length];
		
		for(int i=0; i<temp.length; i++) {
			data[i] = temp[i];	
		}
		
		front = 0;
		rear = temp.length-1;
	}
	
	public void enqueue(int element)  {
		 if(size == data.length) {
//			 throw new QueueFullException();
			 doubleCapacity();
		 }
		
			size++;
			
			if(size==1) {
				front=0;;
				rear=0;
			}else {
				rear++;
			}
			
			data[rear] = element;
			
	}
	
	public int front() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}
		return data[front];
	}
		
	public int dequeue() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}
		
		int temp = data[front];
		front++;
		size--;
		
		if(front == data.length) {
			front=0;
		}
		
		if(size==0) {
			front = -1;
			rear = -1;
		}
		
		return temp;
	}
}

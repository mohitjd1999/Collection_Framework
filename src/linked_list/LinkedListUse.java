package linked_list;

public class LinkedListUse {
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(-1);
		Node<Integer> n5 = new Node<>(1);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		return n1;
	}

	
	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		
		System.out.println();
	}
	
	public static int length(Node<Integer> head) {
		int count=0;

        while(head.data != -1){
            count++;
            head = head.next;
        }

        return count;
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head = createLinkedList();
		
//		print(head);
		
		System.out.println(length(head));
		
//		Node<Integer> n1 = new Node<>(10);
//		
//		System.out.println(n1);
//		System.out.println(n1.data);
//		System.out.println(n1.next);

	}

}

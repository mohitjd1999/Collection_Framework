package linked_list;

import java.util.Scanner;

class DoubleNode{
	Node<Integer> head;
	Node<Integer> tail;
	
	DoubleNode(){
		
	}
	
	DoubleNode(Node<Integer> head, Node<Integer> tail){
		this.head = head;
		this.tail = tail;
	}
}


public class ReverseListRecursively {
	
	public static Node<Integer> reverse(Node<Integer> head) {


		if(head==null || head.next==null) {
			return head;
		}
		
		Node<Integer> smallerHead = reverse(head.next);
		Node<Integer> tail = smallerHead;
		
		while(tail.next != null){
			tail = tail.next;
		}
		
		tail.next = head;
		head.next = null;

		return smallerHead;
	}
	
	public static DoubleNode reverseRBetter(Node<Integer> head) {   // Better approach
		DoubleNode ans;
		
		if(head==null || head.next==null) {
			ans = new DoubleNode(head, head);
			//ans.head = head;
			//ans.tail = head;
			return ans;
		}
		
		DoubleNode smallAns = reverseRBetter(head.next);
		smallAns.tail.next = head;
		head.next = null;
		
		ans = new DoubleNode(smallAns.head, head);
		//ans.head = smallAns.head;
		//ans.tail = head;
		return ans;
		
	}

	public static Node<Integer> reverseBest(Node<Integer> head){
		if(head==null || head.next==null) {
			return head;
		}
		
		Node<Integer> smallHead = reverseBest(head.next);
		Node<Integer> reverseTail = head.next;
		
		reverseTail.next = head;
		head.next = null;
		
		return smallHead;
 	}
	
	public static void print(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
	
	public static Node<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		Node<Integer> head = null, tail = null;	
		
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			
			if(head == null) {
				head = currentNode;
				tail = currentNode;
			}else {
				tail.next = currentNode;
				tail = currentNode;
			}
			
			data = sc.nextInt();
			
		}
		
		return head;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		Node<Integer> head = takeInput();
		
//		head = reverse(head);
		
//		DoubleNode ans = reverseRBetter(head);
		
		head = reverseBest(head);
		
		print(head);

		
	}

}

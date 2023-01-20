package linked_list;

import java.util.Scanner;

public class PalindromeLinkedList {
	
	public static Node<Integer> mid(Node<Integer> head){
		Node<Integer> slow=head, fast=head;

		while(fast.next!=null && fast.next.next != null ){
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	public static Node<Integer> mergeTwoSort(Node<Integer> head1, Node<Integer>head2){
		if(head1==null) {
			return head2;
		}
		
		if(head2==null) {
			return head1;
		}
		
		Node<Integer> t1=head1, t2=head2, head=null, tail=null;
		
		if(t1.data<=t2.data) {
			head=t1;
			tail=t1;
			t1=t1.next;
		}else {
			head=t2;
			tail=t2;
			t2=t2.next;
		}
		
		while(t1!=null && t2!=null) {
			if(t1.data<=t2.data) {
				tail.next=t1;
				tail=t1;
				t1=t1.next;
			}else {
				tail.next=t2;
				tail=t2;
				t2=t2.next;
			}
		}
		
		if(t1!=null) {
			tail.next=t1;
		}else {
			tail.next=t2;
		}
		
		return head;
	}

	public static Node<Integer>reverseLinkedList(Node<Integer> head){
		if(head==null || head.next==null) {
			return head;
		}
		
		Node<Integer> smallHead = reverseLinkedList(head.next);
		Node<Integer> reverseTail = head.next;
		
		reverseTail.next = head;
		head.next = null;
		
		return smallHead;
	}


	public static boolean isPalindrome(Node<Integer> head) {
		if(head==null || head.next ==null){
				return true;
		}

		Node<Integer> head1= null, mid=null, head2=null;

		mid = mid(head);

		head1 = head;
		head2 = mid.next;
		mid.next=null;

		head2 = reverseLinkedList(head2);
		
		if(head1.data != head2.data) {
			return false;
		}else {
			isPalindrome(head.next);
		}
		
		return false;


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
		
		System.out.println(isPalindrome(head)); 

		
	}

}

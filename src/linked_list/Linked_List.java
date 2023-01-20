package linked_list;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;


public class Linked_List {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		
		list.add(10);                     // adding the elements
		list.add(30);
		list.add(30);
		list.add(40);
		
		list.add(1, 20);                 // Add the element at the given index
		
		System.out.println(list);
		
		List<Integer> newList = new LinkedList<>();    
		 
		newList.add(50);
		newList.add(60);
		
		list.addAll(newList);
		System.out.println(list);
		
		list.remove(1);                 // remove the element at the given index
		System.out.println(list);
		
		list.remove(Integer.valueOf(50)); // remove any specific element
		System.out.println(list);
		
		System.out.println(list.get(1));        // get the element
		
//		list.clear();                     // remove whole list
//		System.out.println(list);
		 
		list.set(1, 20);                 // set the value 
		System.out.println(list);
		
		System.out.println(list.contains(500));         // return boolean
		
		
		// Iterate the list
		
		for(int i=0; i<list.size(); i++) {                        // for loop
			System.out.println("fist element : " + list.get(i));
		}
		 
		for(int Element : list) {                                 // for each
			System.out.println("for each " + Element);
		}
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println("Iterator " + it.next());
		}
		
		

	}

}

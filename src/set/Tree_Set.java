package set;

import java.util.TreeSet;
import java.util.Set;

public class Tree_Set {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		
		set.add(2);                    // It prints/stored an sorted elements
		set.add(10);
		set.add(40);
		set.add(5);
		set.add(50);
		
		set.add(5);                   // Don't entered the duplicate elements
		set.add(50);
		
		System.out.println(set);
		
		set.remove(40);
		System.out.println(set);
		
		System.out.println(set.contains(50));
		
		System.out.println(set.isEmpty());
		
		set.clear();
		
	}

}

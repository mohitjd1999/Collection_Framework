package set;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(2);               // It prints an Unorder/Random elements
		set.add(10);
		set.add(40);
		set.add(5);
		set.add(50);
		
		
		set.add(5);              // Don't entered the duplicate elements
		set.add(50);
		
		System.out.println(set);
		
		set.remove(40);
		System.out.println(set);
		
		System.out.println(set.contains(50));
		
		System.out.println(set.isEmpty());
		
		set.clear();
		
	}

}

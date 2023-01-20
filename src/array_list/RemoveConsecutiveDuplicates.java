package array_list;

import java.util.Scanner;
import java.util.ArrayList;

public class RemoveConsecutiveDuplicates {
	
	public static ArrayList<Integer> removeconsecutiveduplicates(int arr[]){
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1]!=arr[i]) {
				list.add(arr[i]);
			}
		}
		
		return list;
	}

	public static void main(String[] args) {
		
		int arr[] = {10, 10, 20, 20, 20, 30, 40, 10, 10};
		
		ArrayList<Integer> list = removeconsecutiveduplicates(arr);
		
		for(int i:list) {
			System.out.println(i);
		}
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
	}

}

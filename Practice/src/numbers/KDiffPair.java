package numbers;

import java.util.HashSet;
import java.util.Set;

public class KDiffPair {

	public int[] diffPair(int[] arr, int diff) {
		int[] pair = new int[2];
		
		Set<Integer> ints = new HashSet<>();
		
		for (int integer : arr) {
			ints.add(integer);
		}
		
		int count =0;
		for (Integer integer : arr) {
			if(ints.contains(integer+diff)) {
				pair[0]=integer;
				pair[1]=integer+diff;
				count++;
			}
			if(ints.contains(integer-diff)) {
				pair[0]=integer;
				pair[1]=integer-diff;
				count++;
			}
			ints.remove(integer);
		}
		System.out.println("total pairs = "+count);
		return pair;
	}
	
}

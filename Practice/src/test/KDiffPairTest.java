package test;

import java.util.Arrays;
import java.util.Collections;

import numbers.KDiffPair;

public class KDiffPairTest {

	public static void main(String[] args) {
			
		Integer[] arr={8, 12, 16, 4, 0, 20};
		int diff = 4;
		
		Collections.sort(Arrays.asList(arr));
		
		System.out.println(Arrays.asList(arr));
		Arrays.asList(arr).stream().forEach(i -> System.out.println(i));
		
//		s =() -> {System.out.println("hello"); return 1;}
	}

	
	
	}

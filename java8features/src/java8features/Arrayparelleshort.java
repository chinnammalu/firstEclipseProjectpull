package java8features;

import java.util.Arrays;

public class Arrayparelleshort {

	public static void main(String[] args) {
		int[] arr= {5,2,0,6,1};
		Arrays.parallelSort(arr);
		System.out.println("arr....."+arr);
		for(int i:arr) {
			System.out.println(i);
		}
		
	}

}

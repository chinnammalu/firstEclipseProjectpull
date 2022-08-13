package java8practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[] {5,2,4,6,4};
		int small=arr[0];
		for(int i=0;i<arr.length;i++) {
			small=Math.min(small,arr[i]);
		}
		int big=arr[0];
		System.out.println("small element...."+small);
		for(int j=0;j<arr.length;j++) {
			big=Math.max(big,arr[j]);	
		}
		System.out.println("small element...."+big);
		
		Integer[] arr1=new Integer[] {5,2,4,6,4};
		
		List<Integer> list=Arrays.asList(arr1);
		
	   Collections.sort(list);
		
		list.forEach(
				n->System.out.println("n...element"+n)
				);
		

}}

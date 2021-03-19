package com.class11;

public class class11 {

	public static void main(String[] args) {
		
		
		//
		int[]nums= {10,12,14,44,23,78};
		int total=nums.length;
		
		int fourthElement=nums[3];
	for (int i =0;i<nums.length;i++) {	
		
		System.out.print(nums[i]+ " ");}
		
		for (int i=nums.length-1; i>=0; i--) {System.out.println(nums[i]);}
		
		for(int num : nums) {System.out.println(num);}

	}

}
//advanced for loop disadvantage is that it only loops forward

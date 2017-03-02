package com.codepractice.array;

public class Remove_Duplicates_from_Sorted_Array_Two {

	/*
	 * Follow up for "Remove Duplicates": What if duplicates are allowed at most
	 * twice? For example, given sorted array A = [1,1,1,2,2,3] , your function
	 * should return length = 5 , and A is now [1,1,2,2,3]
	 */

	public int removeDuplicates(int[] nums) {
		if (nums.length <= 2)
			return nums.length;
		
		int index = 2;
		for (int i = 2; i < nums.length; i++) {
			if (nums[i] != nums[index - 2])
				nums[index++] = nums[i];
		}
		
		return index;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

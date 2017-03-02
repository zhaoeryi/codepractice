package com.codepractice.array;

/*

 Given a sorted array, remove the duplicates in place such that each element
 appear only once and return the new length.
 Do not allocate extra space for another array, you must do this in place with
 constant memory.
 For example, Given input array A = [1,1,2] ,
 Your function should return length = 2, and A is now [1,2] .

 */

public class Remove_Duplicates_from_Sorted_Array {

	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int index = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[index] == nums[i]) {
				continue;
			}
			nums[index++] = nums[i];
		}
		return index + 1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

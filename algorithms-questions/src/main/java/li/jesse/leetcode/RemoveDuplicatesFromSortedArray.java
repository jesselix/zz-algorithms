package li.jesse.leetcode;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {

	public static int removeDuplicatesFromSortedArray(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}

		return set.size();
	}

	public static int removeDuplicatesFromSortedArray2(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int count = 1;
		
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i + 1] != nums[i]) {
				count++;
			}
		}

		return count;
	}


	public static int removeDuplicatesFromSortedArray3(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int back = 0;
		for (int front = 1; front < nums.length; front++) {
			if (nums[back] != nums[front]) {
				back++;
				nums[back] = nums[front];
			}
		}
		return back + 1;
	}

}

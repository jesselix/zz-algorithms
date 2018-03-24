//package li.jesse.leetcode;
//
//import li.jesse.util.ArrayUtil;
//
///*
//189. Rotate Array
//Easy
//
//Rotate an array of n elements to the right by k steps.
//For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
//
//Note:
//Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
//
//Hint:
//Could you do it in-place with O(1) extra space?
//Related problem: Reverse Words in a String II
// */
//
//public class RotateArray
//{
//    public static void rotate(int[] nums, int k)
//    {
//        ArrayUtil.printArray(nums);
//        System.out.println();
//
//        int len = nums.length;
//        k %= len;
//        reverse(nums, 0, len-1);
//        reverse(nums, 0, k-1);
//        reverse(nums, k, len-1);
//
//        ArrayUtil.printArray(nums);
//    }
//
//    public static void reverse(int[] nums, int l, int r){
//        while(l < r){
//            int temp = nums[l];
//            nums[l] = nums[r];
//            nums[r] = temp;
//            l++;
//            r--;
//        }
//    }
//}


/*
    Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order.
    The sorting must be done in-place, without making a copy of the original array.

    Example:
    Input: nums = [1, 0, 2, 1, 0]
    Output: [0, 0, 1, 1, 2]

    Explanation:
    The nums array in sorted order has 2 zeroes, 2 ones and 1 two

    Constraints:
    1 <= nums.length <= 105
    nums consists of 0, 1 and 2 only.
*/

import java.util.Arrays;

public class DutchNationalFlagAlgo {
    public static void sortZeroOneTwo(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid <= high) {
            if (nums[mid] == 0) {
                swap(low, mid, nums);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(mid, high, nums);
                high--;
            }
        }
    }

    private static void swap (int aIndex, int bIndex, int[] nums) {
        int temp = nums[aIndex];
        nums[aIndex] = nums[bIndex];
        nums[bIndex] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 1, 0};
        System.out.println("Original array: " + Arrays.toString(nums));
        sortZeroOneTwo(nums);
        System.out.println("Array after sorting: " + Arrays.toString(nums));
    }
}
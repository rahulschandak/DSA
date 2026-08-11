/*
Given a sorted array of nums and an integer x, write a program to find the upper bound of x.
The upper bound of x is defined as the smallest index i such that nums[i] > x.
If no such index is found, return the size of the array.

Example 1
Input : n= 4, nums = [1,2,2,3], x = 2
Output:3
Explanation:
Index 3 is the smallest index such that arr[3] > x.

Example 2
Input : n = 5, nums = [3,5,8,15,19], x = 9
Output: 3
Explanation:
Index 3 is the smallest index such that arr[3] > x.
*/

package BinarySearch;

public class UpperBound {
    public static int upperBound(int[] nums, int x) {
        int first = 0;
        int last = nums.length - 1;
        int ans = nums.length;
        while (last >= first) {
            int mid = first + ((last - first) / 2);
            if (nums[mid] <= x) {
                first = mid + 1;
            } else {
                last = mid - 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 4, 5, 6 };
        int x = 4;
        System.out.println("Upper bound of " + x + " is at index " + upperBound(nums, x));
    }
}

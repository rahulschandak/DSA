/*
Given a sorted array of integers nums with 0-based indexing, find the index of a 
specified target integer. If the target is found in the array, return its index. 
If the target is not found, return -1.

Example 1
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: The target integer 9 exists in nums and its index is 4

Example 2
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: The target integer 2 does not exist in nums so return -1
*/

package BinarySearch;

public class SearchInSortedArray {
    
    public static int search(int[] nums, int target) { 
        int prev = 0;
        int end = nums.length - 1;
        
        while (prev <= end) {
            int mid = prev + (end - prev) / 2;
        
            if (nums[mid] == target) 
                return mid;
            
            if (nums[mid] < target)
                prev = mid+1;
            else {
                end = mid-1;    
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println("Number " + target + " is at index " + search(nums, target));
    }

}

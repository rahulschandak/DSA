/*
Given a sorted array nums and an integer x. Find the floor and ceil of x in nums. 
The floor of x is the largest element in the array which is smaller than or equal to x. 
The ceiling of x is the smallest element in the array greater than or equal to x. 
If no floor or ceil exists, output -1.

Example 1
Input : nums =[3, 4, 4, 7, 8, 10], x= 5
Output: 4 7
Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.

Example 2
Input : nums =[3, 4, 4, 7, 8, 10], x= 8
Output: 8 8
Explanation: The floor of 8 in the array is 8, and the ceiling of 8 in the array is also 8.
*/


package BinarySearch;

public class FloorCeil {
    
    public static int[] getFloorAndCeil(int[] nums, int x) {
        int first = 0;
        int last = nums.length - 1;
        int ans[] = new int[] {-1, -1};
        while (first <= last) {
            int mid = first + (last - first) / 2;

            if (nums[mid] == x) {
                ans[0] = nums[mid];
                ans[1] = nums[mid];
                return ans;
            }

            if (nums[mid] < x) {
                first = mid + 1;
                ans[0] = nums[mid];
            } else {
                last = mid - 1;
                ans[1] = nums[mid];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 4, 5, 6};
        int x = 3;
        int[] ans = getFloorAndCeil(nums, x);
        System.out.println("Floor of " + x + " is " + ans[0]);
        System.out.println("Ceil of " + x + " is " + ans[1]);
    }
}

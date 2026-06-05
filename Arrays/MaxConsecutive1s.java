public class MaxConsecutive1s {
    private static int findMaxConsecutiveOnes(int[] nums) {
        int first = 0;
        while (nums[first] != 1) {
            first++; 
            if (first == nums.length) {
                return 0;
            }
        }

        int second = first;
        int max = 0;
        int subMax = 0;
        while (second != nums.length) {
            if (nums[second] == 1) {
                subMax = second - first + 1;
                second++;
            } else {
                second++;
                first = second;
            }

            max = Math.max(subMax, max);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums)); // Output: 3
    }
}

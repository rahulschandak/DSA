public class SecondLargestElement {
    
    private static int findSecondLargest(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n > max) {
                secondMax = max;
                max = n;
            } else if (n > secondMax && n != max) {
                secondMax = n;
            }
        }
        return secondMax == Integer.MIN_VALUE ? -1 : secondMax;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5, 9};
        int secondLargest = findSecondLargest(nums);
        System.out.println("Second Largest Element: " + secondLargest);
    }
}

import java.util.Arrays;

public class UnionOfTwoSortedArrays {
    private static int[] unionArray(int[] nums1, int[] nums2) {
        int a = 0;
        int b = 0;
        int i = 0;
        int[] result = new int[nums1.length + nums2.length];
        while (a < nums1.length && b < nums2.length) {
            if (nums1[a] == nums2[b]) {
                if (i == 0 || result[i - 1] != nums1[a]) {
                    result[i] = nums1[a];
                    i++;
                }
                a++;
                b++;
            } else if (nums1[a] < nums2[b]) {
                if (i == 0 || result[i - 1] != nums1[a]) {
                    result[i] = nums1[a];
                    i++;
                }
                a++;
            } else {        // nums1[a] > nums2[b]
                if (i == 0 || result[i - 1] != nums2[b]) {
                    result[i] = nums2[b];
                    i++;
                }
                b++;
            }
        }

        while (a < nums1.length) {
            if (i == 0 || result[i - 1] != nums1[a]) {
                result[i] = nums1[a];
                i++;
            }
            a++;
        }

        while (b < nums2.length) {
            if (i == 0 || result[i - 1] != nums2[b]) {
                result[i] = nums2[b];
                i++;
            }
            b++;
        }

        return Arrays.copyOf(result, i);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4, 5, 6};
        int[] nums2 = {2, 3, 5, 7};
        int[] result = unionArray(nums1, nums2);
        System.out.println(Arrays.toString(result)); // Output: [1, 2, 3, 4, 5, 6, 7]
    }
}
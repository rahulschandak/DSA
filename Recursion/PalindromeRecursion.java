package Recursion;

public class PalindromeRecursion {
    private static boolean isPallindrome(String str) {
        return isPallindromeHelper(str, 0, str.length() - 1);
    }


    private static boolean isPallindromeHelper(String str, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (str.charAt(left) == str.charAt(right)) {
            return isPallindromeHelper(str, left + 1, right - 1);
        }
        
        return false;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPallindrome(str));
    }
}

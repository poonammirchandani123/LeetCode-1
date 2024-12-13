public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] testCases = {121, -121, 10, 0, 12321, 12345};
        for (int testCase : testCases) {
            System.out.println("Is " + testCase + " a palindrome? " + solution.isPalindrome(testCase));
            System.out.println("------------------------------------------------");
        }
    }

    public boolean isPalindrome(int x) {
        System.out.println("Input number: " + x);

        // Negative numbers are not palindromes
        if (x < 0) {
            System.out.println("Negative number. Returning false.");
            return false;
        }

        // Reverse the number
        int n = x;
        int revNum = 0;

        System.out.println("Reversing the number...");
        while (n > 0) {
            int d = n % 10; // Extract the last digit
            System.out.println("Current digit: " + d);
            revNum = revNum * 10 + d; // Build the reversed number
            System.out.println("Reversed number so far: " + revNum);
            n = n / 10; // Remove the last digit
            System.out.println("Remaining number: " + n);
        }

        System.out.println("Reversed number: " + revNum);

        // Check if the reversed number matches the original
        boolean result = revNum == x;
        System.out.println("Is the reversed number equal to the original? " + result);
        return result;
    }
}

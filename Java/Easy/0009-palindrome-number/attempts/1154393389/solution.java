class Solution {
   public boolean isPalindrome(int x) {
        // Convert integer to string
        String str = Integer.toString(x);

        // Check if the length is less than or equal to 1
        if (str.length() <= 1) {
            return true;
        }

        // Extract the first and last characters
        char last = str.charAt(str.length() - 1);
        char first = str.charAt(0);

        // Check if the first and last characters are the same
        if (last == first) {
            // Recursively check the substring without the first and last characters
            return isPalindrome(Integer.parseInt(str.substring(1, str.length() - 1)));
        } else {
            return false;  // If the first and last characters are not the same, it's not a palindrome
        }
    }
}
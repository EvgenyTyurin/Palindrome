/**
 * Check if string is a palindrome
 */

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(palindrome("kayak")); // true
    }

    static boolean palindrome(String str) {
        // Cycle from start to middle of str and check the symmetric char
        for (int idx = 0; idx < str.length() / 2; idx++) {
            if (str.charAt(idx) != str.charAt(str.length() - idx - 1))
                return false;
        }
        return true;
    }

}

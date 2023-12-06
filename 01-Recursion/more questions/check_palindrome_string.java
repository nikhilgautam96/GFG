package Recursion.more questions;

public class check_palindrome_string {
    public static boolean isPalindrome(String str, int s, int e) {
        if(str.charAt(s) != str.charAt(e)) {
            return false; // not a palindrome number.
        }
        if(s >= e) {
            return true;
        }
        return isPalindrome(str, s+1, e-1);
    }
}

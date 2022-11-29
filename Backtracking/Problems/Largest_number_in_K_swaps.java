// Time : O(n ^ k) - For every recursive call 'n' recursive calls is generated 
//                  until the value of k is 0. So total recursive calls are O((n)^k).
// Space : O(n) - The space required to store the answer, where n is the size of string.
package Backtracking.Problems;
class Largest_number_in_K_swaps {
    static String maximum;
    static char[] swap(char str[], int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        return str;
    }
    static void maxString(char str[], int k) {
        if(k == 0) {
            return;
        }
        for(int i = 0; i<str.length - 1; i++) {
            for(int j = i + 1; j<str.length; j++) {
                if(str[j] > str[i]) {
                    str = swap(str, i, j);
                    String temp = new String(str);
                    if(temp.compareTo(maximum) > 0) {
                        maximum = temp;
                    }
                    maxString(str, k-1);
                    str = swap(str, i, j); // Backtracking.
                }
            }
        }
    }
    //Function to find the largest number after k swaps.
    public static String findMaximumNum(String str, int k) {
        maximum = str;
        maxString(str.toCharArray(), k);
        return maximum;
    }
}

// O(n) time, O(maxElement) space.
package Sorting.All_Sorting_Techniques;
public class counting_sort {
    public static String countSort(String arr) {
        char ch[] = arr.toCharArray();
        int alpha[] = new int[26];
        for(int i = 0; i<ch.length; i++) {
            alpha[ch[i]-97]++;
        }
        for(int i = 1; i<26; i++) {
            alpha[i] += alpha[i-1];
        }
        char res[] = new char[ch.length];
        for(int i = ch.length - 1; i>=0; i--) {
            int index = alpha[ch[i]-97] -1;
            res[index] = ch[i];
            alpha[ch[i]-97]--;
        }
        return String.valueOf(res);
    }
}

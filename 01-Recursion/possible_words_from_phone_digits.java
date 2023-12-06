import java.util.*;
public class possible_words_from_phone_digits {
    static String key[] = {"", "", "abc","def","ghi","jkl","mno",
                                    "pqrs","tuv","wxyz"};
    static void genKey(int a[], String cur, int index, int n, ArrayList<String> ans) {
        if(index == n) {
            ans.add(cur);
            return;
        }
        for(int j = 0; j < key[a[index]].length(); j++) {
            genKey(a, cur + key[a[index]].charAt(j), index+1, n, ans);
        }
    }
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here.
        
        ArrayList<String> ans = new ArrayList<String>();
        genKey(a, "", 0, N, ans);
        return ans;
    }
}

import java.util.*;
public class string_permutations {
    public void swap(char ch[], int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
    public void p(char ch[], int index, int n, ArrayList<String> ans) {
        if(index == n) {
            ans.add(String.valueOf(ch));
            return;
        }
        for(int i = index; i<=n; i++) {
            //below - (i, index); (i+1, index); (i+2, index)..so on gets swapped.
            swap(ch, index, i);
            p(ch, index+1, n, ans);
            // since we swap the elements in "ch" so we have to unswap it as it is 
            // in the heap area.
            swap(ch, index, i);
        }
    }
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String> ans = new ArrayList<String>();
        char ch[] = S.toCharArray();
        int n = ch.length;
        p(ch, 0, n-1, ans);
        Collections.sort(ans);
        return ans;
    }
}

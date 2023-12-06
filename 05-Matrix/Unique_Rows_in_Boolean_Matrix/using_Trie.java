// Time : O(row * col), Space : O(row * col).

package Matrix.Unique_Rows_in_Boolean_Matrix;
import java.util.ArrayList;
class trie {
    trie left, right;
    public trie() {
        left = right = null;
    }
}
public class using_Trie {
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][], int r, int c) {
        boolean unique = false;
        trie t = new trie();
        trie head = t;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<r; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            t = head;
            unique = false;
            for(int j = 0; j<c; j++) {
                temp.add(a[i][j]);
                if(a[i][j] == 1 && t.right != null) {
                    t = t.right;
                }else if(a[i][j] == 1 && t.right == null) {
                    t.right = new trie();
                    t = t.right;
                    unique = true;
                }else if(a[i][j] == 0 && t.left != null) {
                    t = t.left;
                }else {
                    t.left = new trie();
                    t = t.left;
                    unique = true;
                }
            }
            if(unique == true)
                ans.add(temp);
        }
        return ans;
    }
}
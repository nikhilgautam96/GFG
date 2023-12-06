package Matrix;
import java.util.ArrayList;
public class boundary_traversal {
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i, j;
        for(i = 0, j = 0; j<m; j++) {
            ans.add(matrix[i][j]);
        }
        for(i = 1, j = m-1; i<n; i++) {
            ans.add(matrix[i][j]);
        }
        for(i = n-1, j = m-2; n != 1 && j>=0; j--) {
            ans.add(matrix[i][j]);
        }
        for(i = n-2, j = 0; m != 1 && i>0; i--) {
            ans.add(matrix[i][j]);
        }
        return ans;
    }
}

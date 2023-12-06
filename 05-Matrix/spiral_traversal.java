package Matrix;
import java.util.ArrayList;
public class spiral_traversal {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i, j;
        int k = 0;
        while(k < r && k < c) {
            for(i = k, j = k; j<c; j++) {
                ans.add(matrix[i][j]);
            }
            for(i = k+1, j = c-1; i<r; i++) {
                ans.add(matrix[i][j]);
            }
            for(i = r-1, j = c-2; r-k != 1 && j>=k; j--) {
                ans.add(matrix[i][j]);
            }
            for(i = r-2, j = k; c-k != 1 && i>k; i--) {
                ans.add(matrix[i][j]);
            }
            r--;
            c--;
            k++;
        }
        return ans;
    }
}

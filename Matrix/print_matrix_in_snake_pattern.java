package Matrix;
import java.util.*;
public class print_matrix_in_snake_pattern {
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int n = matrix.length;
        for(int i = 0; i<n; i++) {
            if(i%2 == 0) {
                for(int j = 0; j<matrix[0].length; j++) {
                    ans.add(matrix[i][j]);
                }
            }else {
                for(int j = n-1; j>=0; j--) {
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
}

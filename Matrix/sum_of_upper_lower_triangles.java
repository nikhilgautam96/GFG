package Matrix;
import java.util.*;
public class sum_of_upper_lower_triangles {
    static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(n == 1) {
            ans.add(matrix[0][0]);
            ans.add(matrix[0][0]);
            return ans;
        }
        int upperSum = 0, lowerSum = 0;
        for(int i = 0; i<n; i++) {
            for(int j = i; j<n; j++) {
                upperSum += matrix[i][j];
                lowerSum += matrix[j][i];
            }
        }
        ans.add(upperSum);
        ans.add(lowerSum);
        return ans;
    }
}

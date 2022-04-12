package Matrix;
public class transpose_of_a_matrix {
    static void transpose(int matrix[][], int n) {
        for(int i = 0; i<n; i++) {
            for(int j = i+1; j<n; j++){
                // swap.
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
    }
}

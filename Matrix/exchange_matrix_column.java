// You are given a matrix of dimensions (n1 x m1). 
// You have to exchange its first column with the last column.

package Matrix;
public class exchange_matrix_column {
    static void exchangeColumns(int matrix[][]) {
        int r = matrix.length, c = matrix[0].length;
        if(c == 1)
            return;
        for(int i = 0; i<r; i++) {
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][c-1];
            matrix[i][c-1] = temp;
        }
    }
}

package Matrix;
public class exchange_all_matrix_columns {
    static void reverseCol(int matrix[][]) {
        int r = matrix.length, c = matrix[0].length;
        if(c == 1)
            return;
        int s = 0, e = c-1;
        while(s < e) {
            for(int i = 0; i<r; i++) {
                int temp = matrix[i][s];
                matrix[i][s] = matrix[i][e];
                matrix[i][e] = temp;
            }
            s++;
            e--;
        }
    }
}

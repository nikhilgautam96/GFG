package Matrix;
public class exchange_matrix_rows {
    static void interchangeRows(int matrix[][]) {
        int r = matrix.length, c = matrix[0].length;
        if(r == 1)
            return;
        int s = 0, e = r-1;
        while(s < e) {
            for(int i = 0; i<c; i++) {
                int temp = matrix[s][i];
                matrix[s][i] = matrix[e][i];
                matrix[e][i] = temp;
            }
            s++;
            e--;
        }
    }
}

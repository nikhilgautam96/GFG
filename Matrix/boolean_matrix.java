package Matrix;
public class boolean_matrix {

    // Method 1 : Time - O(r * c), Space - O(1).
    void booleanMatrix_1(int matrix[][]) {
        int r = matrix.length, c = matrix[0].length;
        // For the 1st column we will mark any eoement as '1' only if 'col0' value
        // is set to '1', and we will consider the matrix[0][0] cell's value
        // only when marking the 1st row and not the first column.
        int col0 = 0;
        for(int i = 0; i<r; i++) {
            if(matrix[i][0] == 1) {
                col0 = 1;
            }
            for(int j = 1; j<c; j++) {
                if(matrix[i][j] == 1) {
                    matrix[0][j] = matrix[i][0] = 1;
                }
            }
        }
        for(int i = r-1; i>=0; i--) {
            for(int j = c-1; j>=1; j--) {
                if(matrix[i][j] != 1 && (matrix[0][j] == 1 || matrix[i][0] == 1)) {
                    matrix[i][j] = 1;
                }
            }
            if(col0 == 1) {
                matrix[i][0] = 1;
            }
        }
    }

    // Method 2 : Time - O(r * c), Space - O(r) + O(c)
    void booleanMatrix_2(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
        int rf[] = new int[row];
        int cf[] = new int[col];
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                if(matrix[i][j] == 1) {
                    rf[i] = 1;
                    cf[j] = 1;
                }
            }
        }
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++){
                if(rf[i] == 1 || cf[j] == 1) {
                    matrix[i][j] = 1;
                }
            }
        }
    }

    // Method 3 : Time - O((r*c) * (r + c)), Space - O(1).

    // In this method - we will traverse the entire array and while traversing
    // if(matrix[i][j] == 1) {
            // change all the values in the entire row 'i' and entire column 'j'
            // as '-1' skipping the cells where the value is  '1'.
            // we skip these cells bcz in future if we come to these cell and see
            // the value is again '1' then we can mark that particular row and column
            // as well, by this way we ensure no such cell is missed.
    // }
    // Then,
    // we traverse the matrix again and this time
    // if(matrix[i][j] == -1) {
            // make
            // matrix[i][j] = 1;
    // }
}

// Time : O(n * n), Space : O(n).
package Matrix;
public class make_matrix_beautiful {
    static int findMinOperation(int matrix[][], int n) {
        int rowSum[] = new int[n];
        int colSum[] = new int[n];
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                rowSum[i] += matrix[i][j];
                colSum[j] += matrix[i][j];
            }
        }
        int maxSum = 0;
        for(int i = 0; i<n; i++) {
            maxSum = Math.max(maxSum, Math.max(rowSum[i], colSum[i]));
        }
        int count = 0;
        for(int i = 0, j = 0; i<n && j<n; ) {
            int minIncrement = Math.min(maxSum - rowSum[i], maxSum - colSum[j]);
            matrix[i][j] += minIncrement;
            rowSum[i] += minIncrement;
            colSum[j] += minIncrement;
            count += minIncrement;
            
            if(rowSum[i] == maxSum)
                i++;
            if(colSum[j] == maxSum)
                j++;
        }
        return count;
    }
}

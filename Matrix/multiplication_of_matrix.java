package Matrix;
public class multiplication_of_matrix {
    static int[][] multiplyMatrix(int A[][], int B[][]) {
        int r1 = A.length, r2 = B.length, c1 = A[0].length, c2 = B[0].length;
        if(c1 != r2)
            return new int[0][0];
        int ans[][] = new int[r1][c2];
        for(int i = 0; i<r1; i++) {
            for(int k = 0; k<c2; k++) {
                for(int j = 0; j<c1; j++) {
                    ans[i][k] += (A[i][j] * B[j][k]);
                }
            }
        }
        return ans;
    }
}

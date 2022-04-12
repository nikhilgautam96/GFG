package Matrix;
public class adding_two_matrices {
    static int[][] sumMatrix(int A[][], int B[][]) {
        int ar = A.length, ac = A[0].length;
        int br = B.length, bc = B[0].length;
        int res[][] = new int[ar][ac];
        if(ar != br || ac != bc)
            return new int[0][0];
        for(int i = 0; i<ar; i++) {
           for(int j = 0; j<ac; j++){
               res[i][j] = A[i][j] + B[i][j];
           }
        }
        return res;
    }
}

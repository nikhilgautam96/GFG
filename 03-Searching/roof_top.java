// You are given heights of consecutive buildings. You can move from the roof
// of a building to the roof of next adjacent building.
// You need to find the maximum number of consecutive steps you can put 
// forward such that you gain an increase in altitude with each step.
package Searching;
public class roof_top {
    static int maxStep(int A[], int N) {
        int max = 0;
        int count = 0;
        for(int i = 1; i<N; i++) {
            if(A[i] > A[i-1]) {
                count++;
            }else {
                max = Math.max(count, max);
                count = 0;
            }
        }
        max = Math.max(count, max);
        return max;
    }
}

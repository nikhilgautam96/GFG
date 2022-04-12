package Sorting;
import java.util.*;
public class merge_3_sorted_arrays {
    public static void merge(int x[], int y[], int i, int j, int n1, int n2, ArrayList<Integer> ans) {
        while(i<n1 && j<n2) {
            if(x[i] > y[j]) {
                ans.add(y[j++]);
            }else {
                ans.add(x[i++]);
            }
        }
        while(i<n1) {
            ans.add(x[i++]);
        }
        while(j<n2) {
            ans.add(y[j++]);
        }
    }
    static ArrayList<Integer> merge3sorted(int A[], int B[], int C[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = A.length, m = B.length, o = C.length;
        int i = 0, j = 0, k = 0;
        while(i<n && j<m && k<o) {
            int min = Integer.min(A[i], Integer.min(B[j], C[k]));
            if(min == A[i]) {
                ans.add(A[i++]);
            }else if(min == B[j]) {
                ans.add(B[j++]);
            }else {
                ans.add(C[k++]);
            }
        }
        if(i<n && j<m) {
            merge(A, B, i, j, n, m, ans);
            i = n;
            j = m;
        }else if(j<m && k<o) {
            merge(B, C, j, k, m, o, ans);
            j = m;
            k = o;
        }else if(k<o && i<n) {
            merge(C, A, k, i, o, n, ans);
            k = o;
            i = n;
        }
        while(i<n) {
            ans.add(A[i++]);
        }
        while(j<m) {
            ans.add(B[j++]);
        }
        while(k<o) {
            ans.add(C[k++]);
        }
        return ans;
    }
}

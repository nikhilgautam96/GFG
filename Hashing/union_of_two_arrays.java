package Hashing;
import java.util.*;
public class union_of_two_arrays {
    public static int doUnion(int a[], int n, int b[], int m) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i<n; i++)
            hs.add(a[i]);
        for(int i = 0; i<m; i++)
            hs.add(b[i]);
        return hs.size();
    }
}

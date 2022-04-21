package Hashing;
import java.util.*;
public class intersection_of_two_arrays {
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        int count = 0;
        for(int i = 0; i<n; i++)
            hs1.add(a[i]);
        for(int i = 0; i<m; i++)
            hs2.add(b[i]);
        Iterator<Integer> itr = hs1.iterator(); 
        while (itr.hasNext()) {
            if(hs2.contains(itr.next()) == true) {
                count++;
            }
        }
        return count;
    }
}

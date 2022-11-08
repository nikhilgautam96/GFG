package Heap;
import java.util.*;
class Triplet implements Comparable<Triplet> {
    int val, aPos, vPos;
    Triplet(int val, int aPos, int vPos) {
        this.val = val; this.aPos = aPos; this.vPos = vPos;
    }
    public int compareTo(Triplet t){
        if(val <= t.val) return -1;
        else return 1;
    }
}
public class merge_k_sorted_arrays {
    /**
     * Method 1 : O(nk * log nk)
     *          - here we first copy elements of all the K arrays in a new array and then
     *          - sort this new merged array.
     */
    /**
     * Method 2 : O(nk^2)
     *          - here we merge 2 arrays at a time using comparisons, 
     *          - and every time a merged array is created we merge this new merged array 
     *          - with the next array in set of K arrays.
     */
    /**
     * Method 3 : O(nk * log k)
     *          - we use a Min-Heap of Size K.
     */
    static ArrayList<Integer> mergeArrays(ArrayList<ArrayList<Integer> > arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Triplet> pq = new PriorityQueue<>(); // Min-Heap.
        for(int i = 0; i < arr.size(); i++) {
            pq.add(new Triplet(arr.get(i).get(0), i, 0));
        }
        while(!(pq.isEmpty())) {
            Triplet cur = pq.poll();
            ans.add(cur.val);
            int ap = cur.aPos, vp = cur.vPos;
            if((vp + 1) < arr.get(ap).size()) {
                pq.add(new Triplet(arr.get(ap).get(vp + 1), ap, vp + 1));
            }
        }
        return ans;
    }
    public static void main (String[] args) {
        ArrayList<ArrayList<Integer> > arr=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> a1 = new ArrayList<Integer>(); 
        a1.add(10); 
        a1.add(20);
        a1.add(30);
        arr.add(a1); 

        ArrayList<Integer> a2 = new ArrayList<Integer>(); 
        a2.add(5);
        a2.add(15);
        arr.add(a2); 

        ArrayList<Integer> a3 = new ArrayList<Integer>(); 
        a3.add(1); 
        a3.add(9); 
        a3.add(11);
        a3.add(18);
        arr.add(a3);
            
        List<Integer> res = mergeArrays(arr); 
        System.out.println("Merged array is " ); 
        for (int x : res) 
            System.out.print(x + " ");
    }
}

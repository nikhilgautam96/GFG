package Graph.GFG_Problems;
import java.util.*;
public class print_adjacency_list {
    public ArrayList<ArrayList<Integer>> printGraph(
        int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<ArrayList<Integer>> copy = new ArrayList<>();
        int k = 0;
        for(ArrayList<Integer> i : adj) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(k++);
            for(int j : i) {
                temp.add(j);
            }
            copy.add(temp);
        }
        return copy;
    }
}

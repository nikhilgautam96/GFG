package Hashing;
import java.util.ArrayList;
public class seperate_chaining {
    public ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int hashSize) {
        ArrayList<ArrayList<Integer>> hashTable = new ArrayList<>();
        for(int i = 0; i<hashSize; i++) {
            hashTable.add(new ArrayList<Integer>());
        }
        for(int i = 0; i<n; i++) {
            int hashValue = arr[i] % hashSize;
            hashTable.get(hashValue).add(arr[i]);
        }
        return hashTable;
    }
}

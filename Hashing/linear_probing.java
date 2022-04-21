package Hashing;
import java.util.*;
public class linear_probing {
    int[] linearProbing(int hash_size, int arr[], int sizeOfArray) {
        int hashTable[] = new int[hash_size];
        Arrays.fill(hashTable, -1);
        for(int i = 0; i<sizeOfArray; i++) {
            int hashValue = arr[i] % hash_size;
            if(hashTable[hashValue] == -1) {// || hashTable[hashValue] == arr[i]) {
                hashTable[hashValue] = arr[i];
            }
            else {
                for(int j = 0; j<hash_size; j++) {
                    int hashValue2 = (hashValue + j) % hash_size;
                    if(hashTable[hashValue2] == arr[i]) {
                        break;
                    }else if(hashTable[hashValue2] == -1) {
                        hashTable[hashValue2] = arr[i];
                        break;
                    }
                }
            }
        }
        return hashTable;
    }
}

package Hashing;
import java.util.*;
public class quadratic_probing {
    static void quadraticProbing(int[] hash, int hash_size, int arr[], int N) {
        Arrays.fill(hash, -1);
        for(int i = 0; i<N; i++) {
            int hashValue = arr[i] % hash_size;
            if(hash[hashValue] == -1) {
                hash[hashValue] = arr[i];
            }
            else {
                for(int j = 0; j<hash_size; j++) {
                    int hashValue2 = (hashValue + j * j) % hash_size;
                    if(hash[hashValue2] == arr[i]) {
                        break;
                    }else if(hash[hashValue2] == -1) {
                        hash[hashValue2] = arr[i];
                        break;
                    }
                }
            }
        }
    }
}

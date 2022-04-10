//          Naive               : O(n^2) time, O(1) space.
//    HashMap or Freq array     : O(n) time, O(n) space.
//   Moore's Vooting algorithm  : O(n) time, O(1) space.
package Searching;
public class majority_element {
    static int majorityElement(int a[], int size) {
        int val = -1, count = 0;
        for(int i = 0; i<size; i++) {
            if(count == 0) {
                val = a[i];
                count++;
            } else if(a[i] == val) {
                count++;
            } else {
                // (a[i] != val)
                count--;
            }
        }
    // From above step, we get 'val' as a potential candidate for majority element.
    // so we can confirm it by rechecking freq of 'val' by traversing the array.
        count = 0;
        for(int i = 0; i<size; i++) {
            if(a[i] == val) {
                count++;
                if(count > size/2) return val;
            }
        }
        return -1;
    }
}

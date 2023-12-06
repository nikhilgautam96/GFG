package Searching;
public class square_root {
    long floorSqrt(long x) {
        long low = 1, high = x;
        long ans = 0;
        while(low <= high) {
           long root = low + (high-low)/2;
           long square = root * root;
           if(square == x)
               return root;
           else if(square > x) {
               high = root-1;
           }else {
               ans = root;
               low = root+1;
           }
        }
       return ans;
    }
}

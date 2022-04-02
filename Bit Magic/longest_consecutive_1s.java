package Bit Magic;

public class longest_consecutive_1s {
    public static int maxConsecutiveOnes(int N) {
        int count = 0;
        while (N != 0) {
            N = N & N >> 1;
            count++;
        } 
        return count;
    }
}

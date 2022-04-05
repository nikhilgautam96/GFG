public class maximum_occured_integer {
    public static int maxOccured(int L[], int R[], int n, int maxx) {
        int freq[] = new int[maxx+2];
        for(int i = 0; i<n; i++) {
            freq[L[i]] += 1;
        }
        for(int i = 0; i<n; i++) {
            freq[R[i]+1] -= 1;
        }
        int ans = freq[0];
        int ansIndex = 0;
        for(int i = 1; i<=maxx; i++) {
            freq[i] += freq[i-1];
            if(freq[i] > ans) {
                ans = freq[i];
                ansIndex = i;
            }
        }
        return ansIndex;
    }
}

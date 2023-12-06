class Frequencies{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
        // we need to store the frequencies of elements from '1 to N' in indexes '0 to N-1'.
        for(int i = 0; i<N; i++) {
            if(arr[i] > N) {
                arr[i] = 0;
            }
        }
        int k = N + 1;
        for(int i = 0; i<N; i++) {
            if(arr[i]%k != 0 && arr[i]%k <= N) {
                arr[(arr[i]%k) - 1] += k; 
            }
        }
        for(int i = 0; i<N; i++) {
            arr[i] /= k;
        }
    }

    public static void betterTechnique(int arr[], int n) {
        int expectedPos, pos=0;
        while (pos<n) {
            expectedPos = arr[pos]-1;
            if (arr[pos] >0 && arr[expectedPos]>0)
            {
                arr[pos] = arr[expectedPos];
                arr[expectedPos] = -1;
            }
            else if (arr[pos] >0)
            {
                arr[expectedPos]--;
                arr[pos++] = 0;
            }
            else
            {
                pos++;
            }
        }
        for (int i=0;i<n;i++) {
            printf("%d -> %d\n", i+1, abs(arr[i]));
        }
    }
}
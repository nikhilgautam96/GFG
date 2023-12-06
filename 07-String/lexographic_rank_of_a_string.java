// Time : O(n).
package String;
public class lexographic_rank_of_a_string {
    static int findRank(String S) {
        int n = S.length();
        long rank = 0, mod = 1000000007l;
        long fact[] = new long[27];
        int alpha[] = new int[256];
        fact[0] = 1;
        for(int i = 1; i<=26; i++) {
            fact[i] = (i * fact[i-1]) % mod;
        }
        for(int i = 0; i<n; i++) {
            alpha[S.charAt(i)]++;
            if(alpha[S.charAt(i)] > 1)
                return 0;
        }
        for(int i = 0; i<n; i++) {
            int countOfSmallerLetters = 0;
            for(int j = 0; j<256; j++) {
                if(j == S.charAt(i))
                    break;
                if(alpha[j] == 1)
                    countOfSmallerLetters++;
            }
            rank = (rank + (countOfSmallerLetters * fact[n-i-1]) % mod) % mod;
            alpha[S.charAt(i)]--;
        }
        return (int)((rank+1) % mod);
    }
}

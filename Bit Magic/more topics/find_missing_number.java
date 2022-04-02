// You are given a list of n-1 integers and these integers are in the range of 1 to n.
// There are no duplicates in the list. One of the integers is missing in the list. 
// Write an efficient code to find the missing integer.

public class find_missing_number {
    public static int findMissingNumber(int[] nums) {
        int n=nums.length;
        int sum=((n+1)*(n+2))/2; // sum of first 'n' natural numbers is = n * (n+1)/2.
        for(int i=0;i<n;i++)
          sum-=nums[i];
        return sum;
    }
    // XOR approach.
    public static int getMissingNo(int a[]) {
        int n = a.length;
        int x1 = a[0];
        int x2 = 1;
 
        /* For xor of all the elements
           in array */
        for (int i = 1; i < n; i++)
            x1 = x1 ^ a[i];
 
        /* For xor of all the elements
           from 1 to n+1 */
        for (int i = 2; i <= n + 1; i++)
            x2 = x2 ^ i;
 
        return (x1 ^ x2);
    }
    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 5, 6 };
        System.out.println(findMissingNumber(a));
    }
}

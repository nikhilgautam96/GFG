public class sum_of_digits {
    public static int sumOfDigits(int n) {
        // add your code here
        if(n < 10)
            return n;
        return n%10 + sumOfDigits(n/10);
    }
}

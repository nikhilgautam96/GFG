public class check_power_of_2 {
    public static boolean isPowerofTwo(long n){
        if(n != 0 && (n & (n - 1)) == 0) 
            return true;
        return false;
    }
}

public class maximum_And_value {
    public static int maxAND (int arr[], int N) {
        int maxAndValue = 0, intMax = 31;
        while(intMax >= 0) {
            int count = 0;
            int pattern = maxAndValue | (1 << intMax);
            for(int i = 0; i<arr.length; i++) {
                if((arr[i] & pattern) == pattern) {
                    count++;
                }
            }
            if(count > 1) {
                maxAndValue = maxAndValue | (1 << intMax);
            }
            intMax--;
        }
        return maxAndValue;
    }
    public static void main(String[] args) {
        int a[] = {4, 8, 12, 16};
        System.out.println(maxAND(a, 4));
    }
}

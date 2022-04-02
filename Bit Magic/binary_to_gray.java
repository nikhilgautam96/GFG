public class binary_to_gray {
    public static int greyConverter(int n) {
        return n ^ n >> 1;
    }
}

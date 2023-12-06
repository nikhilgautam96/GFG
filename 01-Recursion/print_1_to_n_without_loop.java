public class print_1_to_n_without_loop {
    public void printNos(int N)
    {
        //Your code here
        if(N == 0)
            return;
        printNos(N-1);
        System.out.print(N+" ");
    }
}

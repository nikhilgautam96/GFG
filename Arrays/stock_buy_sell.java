// O(n) time and O(1) space;

import java.util.*;
public class stock_buy_sell {
    // To get only the profit.
    static int maxProfit(int prices[], int size) {
        // maxProfit adds up the difference between
        // adjacent elements if they are in increasing order
        int maxProfit = 0;
    
        // The loop starts from 1 as its comparing with the previous
        for (int i = 1; i < size; i++)
            if (prices[i] > prices[i - 1])
                maxProfit += prices[i] - prices[i - 1];
        return maxProfit;
    }

    // To get the "buying and selling price pairs".
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int cp = 0, sp = 0, profit = 0;
        boolean transaction = false; //to check if there is an ongoing transaction.
        for(int i = 0; i<n-1; i++) {
            if(transaction == false) {
                if(A[i] < A[i+1]) {
                    cp = A[i];
                    transaction = true; //start a transaction.
                }
            } else {
                // there is an ongoing transaction.
                if(A[i] >= sp) {
                    sp = A[i];
                } else {
                    profit += (sp - cp);
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(cp);
                    temp.add(sp);
                    ans.add(temp);
                    cp = 0;
                    sp = 0;
                    transaction = false;
                    i--;
                }
            }
        }
        if(transaction == true) {
            sp = Math.max(sp, A[n-1]);
            profit += (sp - cp);
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(cp);
            temp.add(sp);
            ans.add(temp);
        }
        return ans;
    }
}

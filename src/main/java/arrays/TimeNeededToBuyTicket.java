package arrays;

import java.sql.Array;

public class TimeNeededToBuyTicket {
    public static void main(String[] args) {

        int [] arr = {2,3,2};
        System.out.println(timeRequiredToBuy(arr,2));

        int [] arr1 = {5,1,1,1};
        System.out.println(timeRequiredToBuy(arr1,0));

    }
    public static int timeRequiredToBuy(int[] tickets, int k){
        int res = 0;
        for (int i = 0; i < tickets.length; i++) {
            if(i<=k){
                res = res + Math.min(tickets[k], tickets[i]);
            }
            else {
                res = res + Math.min(tickets[k]-1, tickets[i]);
            }
        }
        return res;
    }

}

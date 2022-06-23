class Solution {
    public int maxProfit(int[] prices) {
        int profits=0;
        int buy=prices[0];
        int sell=prices[0];
        for(int i:prices){
            if(i<buy){
                buy=i;
                sell=0;
            }
            if(i>buy){
                sell=i;
            }
            if(sell-buy>profits)
                profits=sell-buy;
            //System.out.println(buy+" "+sell);
        }
        
        return profits;
    }
}
class Solution {
    public int maxProfit(int[] prices) {

        int p = 0;

        int min = prices[0];

        int n = prices.length;

        for(int i=0;i<n;i++){

            if(prices[i]<min){

                min = prices[i];
            }

            else if(p<prices[i] - min){

                p= prices[i]-min;
            }
        }

        return p;
        
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrice = Integer.MAX_VALUE;
        int maxpro = 0;

        // Traverse through the array only once

        for(int i =0; i<n;i++){
            minPrice = Math.min(minPrice, prices[i]);
            maxpro = Math.max(maxpro, prices[i]-minPrice);
        }
        return maxpro;
        
    }
}

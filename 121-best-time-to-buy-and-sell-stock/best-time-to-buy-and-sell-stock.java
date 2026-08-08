class Solution {
    public int maxProfit(int[] prices) {
        int pro=0;
        int cst=0;
        int minn=prices[0];
        for(int i=0;i<prices.length;i++)
        { 
            cst=prices[i]-minn;
           minn=Math.min(minn,prices[i]);
           pro=Math.max(pro,cst);
        }
        return pro;
    }
}
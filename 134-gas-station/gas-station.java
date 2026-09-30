class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<gas.length;i++)
        {
            sum1+=gas[i];
            sum2+=cost[i];
        }
        if(sum1-sum2<0)
        {
            return -1;
        }
        int start=0;
        int tank=0;
        for(int k=0;k<gas.length;k++)
        {
            int d=gas[k]-cost[k];
            tank+=d;
            if(tank<0)
            {
                start=k+1;
                tank=0;
            }
        }
        if(tank>=0)
        {
            return start;
        }
        else{
            return -1;
        }
    }
}
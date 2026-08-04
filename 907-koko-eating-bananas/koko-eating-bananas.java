class Solution {
    public long hours(int arr[],int mid)
    {
        int n=arr.length;
        int ans=0;
        int cr=0;
        long sum=0;
      for(int i=0;i<n;i++)
      {
       ans=(int) Math.ceil((double) arr[i] / mid);
       sum=sum+ans;
      }
      return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int high=Integer.MIN_VALUE;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        int low=1;
        int ans=high;
        while(low<=high)
        {
            int mid=(low+high)/2;
            long hrs=hours(piles,mid);
            if(hrs>h)
            {
             low=mid+1;
            }
            else{
              ans=mid;
              high=mid-1;
            }
    }
    return ans;
    }
}

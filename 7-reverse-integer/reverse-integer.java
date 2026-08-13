class Solution {
    public int reverse(int x) {
        int k=x;
        int sum=0;
        int rem;
        int c=0;
        int n=0;
        if(k<0)
        {
            k=k*-1;
            n=1;
        }
        while(k>0)
        {
        rem=k%10;
        c++;
       if (sum > Integer.MAX_VALUE / 10 || 
               (sum == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0; 
            }
             sum=sum*10+rem;
             k=k/10;
        }
        if(n==1)
        {
            sum=sum*-1;
        }
        return sum;
    }
}
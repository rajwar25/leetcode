class Solution {
    public int myAtoi(String s) {
        int i=0;
        int n=s.length();
        if(n==0)
        {
            return 0;
        }
        while(i<n && s.charAt(i)==' ')
        {
          i++;
        }
        int sign=1;
        if (i<n && (s.charAt(i)=='-' || s.charAt(i)=='+')) {
            if (i<n && s.charAt(i)=='-') 
            {
                sign=-1;
            }
            i++;
        }
        long ans=0;
        ans=solve(s,i,0L);
        ans=ans*sign;
        if(ans>Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        if(ans<Integer.MIN_VALUE)
        {
            return Integer.MIN_VALUE;
        }
        return (int)ans;
    }
    public long solve(String s, int i, long num)
    {
        if(i>=s.length() || !Character.isDigit(s.charAt(i)))
        {
            return num;
        }
        int dig=s.charAt(i)-'0';
        long n=num*10+dig;
        if(n>Integer.MAX_VALUE)
         {
        return Integer.MAX_VALUE + 1L; 
         }
        return solve(s,i+1,n);
    }
    }

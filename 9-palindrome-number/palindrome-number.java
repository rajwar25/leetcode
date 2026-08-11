class Solution {
    public boolean isPalindrome(int x) {
        int k=x;
        int l;
        int f;
        int pal=0;
        while(k>0)
        {
            l=k%10;
            pal=pal*10+l;
            k=k/10;
        }
        if(x<0)
        {
            return false;
        }
        if(x==0)
        {
            return true;
        }
        if(pal==x)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
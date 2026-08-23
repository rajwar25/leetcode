class Solution {
    public boolean isValid(String ss) {
        Stack st=new Stack<>();
        int l=ss.length();
        char[] s = ss.toCharArray();
        boolean ans=false;
        for(int i=0;i<l;i++)
        {
           if(s[i]=='(' || s[i]=='[' || s[i]=='{')
           {
            st.push(s[i]);
           }
           else{
            if(st.isEmpty())
            {
                return false;
            }
            char ch=(char)st.peek();
            st.pop();
            if(s[i]==')' && ch=='(')
            {
              ans=true;
            }
           else if(s[i]==']' && ch=='[')
            {
              ans=true;
            }
            else if(s[i]=='}' && ch=='{')
            {
              ans=true;
            }
            else{
                return false;
            }
           }
        }
        if(st.isEmpty())
        {
            ans=true;
        }
        else{
            ans=false;
        }
        return ans;
    }
}
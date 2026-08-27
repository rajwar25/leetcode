class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
      map.put('I', 1);
      map.put('V', 5);
      map.put('X', 10);
      map.put('L', 50);
      map.put('C', 100);
      map.put('D', 500);
      map.put('M', 1000);  
      char[] arr = s.toCharArray();
      int t=0;
      int curr=0;
      for(int i=0;i<s.length();i++)
      { curr=map.get(arr[i]);
        if(i<arr.length-1 && curr<map.get(arr[i+1]))
        {
         t=t-curr;
        }
        else{
            t=curr+t;
        }
      }
      return t;
    }
}
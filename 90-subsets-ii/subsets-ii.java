class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> lt=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        sublets(lt,new ArrayList<>(),nums,n,0);
        return lt;
    }
    public void sublets( List<List<Integer>> lt, List<Integer> ds, int arr[], int n,int indx)
    {
    lt.add(new ArrayList<>(ds));
        if(indx==arr.length)
        {
            return;
        }
        for(int i=indx;i<n;i++)
        {
            if(i>indx && arr[i]==arr[i-1])
            {
                continue;
            }
            ds.add(arr[i]);
            sublets(lt,ds,arr,n,i+1);
            ds.remove(ds.size()-1);    
        }

    }
}
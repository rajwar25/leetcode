class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lt=new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        permutation(lt,nums,0,new ArrayList<>(),used);
        return lt;
    }
    public void permutation( List<List<Integer>> lt, int arr[],int indx, List<Integer> ds,boolean used[])
    {
        if(indx==arr.length)
        {
            lt.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(used[i])
            {
                continue;
            }
            used[i]=true;
            ds.add(arr[i]);
            permutation(lt,arr,indx+1,ds,used);

            ds.remove(ds.size()-1);
            used[i]=false;
        }

    }
}
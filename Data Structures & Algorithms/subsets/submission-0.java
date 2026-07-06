class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    ArrayList<Integer> path = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {

        int n = nums.length;

        int index = 0;

        backtrack(nums,n,0);

        return ans;
        
    }

    public void backtrack(int[] nums,int n,int index){

        if(index>=n){

            ArrayList<Integer> temp = new ArrayList<>(path);

            ans.add(temp);

            return;

        }

        path.add(nums[index]);

        backtrack(nums,n,index+1);

        path.remove(path.size()-1);

        backtrack(nums,n,index+1);
    }
}

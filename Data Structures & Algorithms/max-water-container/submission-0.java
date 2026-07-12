class Solution {
    public int maxArea(int[] heights) {

        int n = heights.length;

        int ans = 0;

        int left = 0;

        int right = n-1;

        while(left <= right){

            int mini = Math.min(heights[left],heights[right]);

            ans = Math.max(ans,mini*(right - left));

            if(heights[left] < heights[right])

            left++;

            else

            right--;
        }

        return ans;
        
    }
}

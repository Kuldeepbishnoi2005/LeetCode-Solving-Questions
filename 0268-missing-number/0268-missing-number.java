class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalsum = (n*(n+1))/2;
        int currentsum = 0;
        for(int i=0 ; i<n ; i++){
            currentsum = currentsum + nums[i];
        }
        int ans = totalsum - currentsum;
        return ans;
    }
}
class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum=nums[0];
        int maxsum=nums[0];

        for (int i=1;i<=nums.length-1;i++){
            if(currentsum + nums[i] > nums[i]){
                currentsum = currentsum + nums[i];
            }else{
                currentsum = nums[i];
            }

            maxsum=Math.max(currentsum,maxsum);
        }
        return maxsum;   
    }
}
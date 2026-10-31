class Solution {
    public int findDuplicate(int[] nums) {

        int ans=0;
        
        for(int i=0;i<nums.length;i++){
            int element = nums[i];
            element = Math.abs(element);
        

            if(nums[element]>0){
                nums[element]=-nums[element];
            }else{
                ans = element;
            }
        }

        for(int i=0;i<nums.length;i++){
            nums[i]= Math.abs(nums[i]);
        }

        return ans;
        
    }
}
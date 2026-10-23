class Solution {
    public int trap(int[] height) {
        int H = height.length;
        
        int[] leftwall = new int[H];
        leftwall [0]= height[0];
        for(int i=1;i<H;i++){
            leftwall[i]=Math.max(leftwall[i-1],height[i]);
        }

        int[] rightwall = new int[H];
        rightwall[H-1]= height[H-1];
        for(int i=H-2;i>=0;i--){
            rightwall[i]=Math.max(rightwall[i+1],height[i]);
        }

        int ans=0;
        for(int i=0;i<H;i++){
            ans += Math.min(leftwall[i],rightwall[i])-height[i];
        }
        return ans;
        
    }
}
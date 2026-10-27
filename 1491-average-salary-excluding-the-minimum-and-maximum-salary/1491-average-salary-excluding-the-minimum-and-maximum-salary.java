class Solution {
    public double average(int[] salary) {
        int minimum = salary[0];
        int maximum = salary[0];
        int sum = salary[0];

        for(int i=1; i<salary.length; i++){
            
            if(minimum>salary[i]){
                minimum=salary[i];
            }else if(maximum<salary[i]){
                maximum=salary[i];
            }

            sum+=salary[i];
        }

        sum=sum-maximum-minimum;
        
        double ans = (double)sum/(salary.length-2);
        return ans ;
    }
}
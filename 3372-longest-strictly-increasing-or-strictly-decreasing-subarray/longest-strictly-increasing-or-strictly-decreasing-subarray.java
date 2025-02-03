class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int strict_increasing =1;
        int strict_decreasing = 1;
        int final_max = 1;

        for(int i =0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]){
                strict_increasing++;
                strict_decreasing = 1;
            }
            else if(nums[i] > nums[i+1]){
                strict_decreasing++;
                strict_increasing = 1;
            }
            else{
                
                strict_increasing = 1;
                strict_decreasing = 1;
            }
            int max_item = Math.max(strict_increasing, strict_decreasing);
            final_max = Math.max(final_max, max_item);
        }
        return final_max;
        
    }
}
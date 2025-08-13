class Solution {
    public boolean increasingTriplet(int[] nums) {
        // fp =0, sp = 1, tp = 2
        // 
        
        if (nums.length< 3){
            return false;
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for(int num : nums){
            if(num <=a){
                a = num;
            }
            else if(num <=b){
                b= num;
            }
            else{
                return true;
            }
        }

        return false;
    }
}
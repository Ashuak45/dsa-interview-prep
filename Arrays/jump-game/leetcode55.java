class Solution {
    public boolean canJump(int[] nums) {
        int last = 0;

        for(int i = 0; i < nums.length; i++) {

            if(i > last) {
                return false;   // can't reach this position
            }

            last = Math.max(last, i + nums[i]);
        }

        return true;
    }
}
        
    

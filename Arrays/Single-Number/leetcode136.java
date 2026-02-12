class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean foundDuplicate = false;
            
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    foundDuplicate = true;
                    break;
                }
            }
            
            if (!foundDuplicate) {
                return nums[i];
            }
        }
        return -1;
    }
}///not learnt the concepts till now which may be better solution for this but applied the brute force approach to find 
//the solution and sometimes thats's more important than anything

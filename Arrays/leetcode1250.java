class Solution {
    public boolean isGoodArray(int[] nums) {
        int gcdValue = nums[0];

        for(int i = 1; i < nums.length; i++){
            gcdValue = gcd(gcdValue, nums[i]);
        }

        return gcdValue == 1;
    }

    private int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

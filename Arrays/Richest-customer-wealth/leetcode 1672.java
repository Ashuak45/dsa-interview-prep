class Solution {
    public int maximumWealth(int[][] accounts) {
       int max=0;
        for(int person=0;person<accounts.length;person++){
            int sum=0;
            for(int wealth=0;wealth<accounts[person].length;wealth++){
            sum+=accounts[person][wealth];
        }
        if(sum>max){
        max=sum;
        }
       
} return max;
    }
}
    
        

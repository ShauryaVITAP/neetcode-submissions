class Solution {
    public int lengthOfLIS(int[] nums) {
       int n=nums.length;
       int[]dp=new int[n+1];
       int ans=1;
       for(int i=0;i<nums.length;i++){
        dp[i]=1;
       
       for(int j=0;j<nums.length;j++){
        if(nums[i]>nums[j]){
            dp[i]=Math.max(dp[i],dp[j]+1);
        }
       }
       ans=Math.max(ans,dp[i]);
       }
       return ans;
    }
}

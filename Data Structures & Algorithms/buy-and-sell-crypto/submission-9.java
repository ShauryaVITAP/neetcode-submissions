class Solution {
    public int maxProfit(int[] nums) {
        int maxprofit=0;
        int minprice=nums[0];

        for(int i=1;i<nums.length;i++){
            int profit=nums[i]-minprice;
            maxprofit=Math.max(maxprofit,profit);
            minprice=Math.min(minprice,nums[i]);
        }
        return maxprofit;
    }
}

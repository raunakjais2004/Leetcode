class Solution {
    public int minOperations(int[] nums, int x) {
        int i=0;
        int j=0;
        int Tsum=0;
        int sum=0;
        int maxL=0;
        for(i=0;i<nums.length;i++){
            Tsum=Tsum+nums[i];
        }
        if(Tsum<x){
            return -1;
        }
        if(Tsum==x){
            return nums.length;
        }
        for(i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>Tsum-x){
                sum-=nums[j];
                j++;
            }
            if(sum==Tsum-x){
                maxL=Math.max(maxL,i-j+1);
            }
        }
        return maxL==0?-1:nums.length-maxL;
    }
}
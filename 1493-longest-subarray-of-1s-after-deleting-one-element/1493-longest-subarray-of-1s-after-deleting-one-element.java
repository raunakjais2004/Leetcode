class Solution {
    public int longestSubarray(int[] nums) {
        int j = 0, maxL = 0, countone = 0, countzero = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                countone++;
            }
            else{
                countzero++;
            }
            while(countzero>1){
                if(nums[j]==1){
                    countone--;
                }
                else{
                    countzero--;
                }
                j++;
            }
            maxL=Math.max(maxL,i-j);
        }
        return maxL;
    }
}
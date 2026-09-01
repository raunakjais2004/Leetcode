class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0;
        int countZero=0;
        int maxL=0;
        int i=0;
        int j=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
            }
            else{
                countZero++;
            }
            while(countZero > k)
            {
               
                if(nums[j]==1){
                    count--;
                }
                else{
                    countZero--;
                }
                j++;
            }
            maxL=Math.max(maxL,i-j+1);
        }
        return maxL;

    }
}
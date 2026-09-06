class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int m = Integer.MIN_VALUE;
        int mi = Integer.MAX_VALUE;
        int[] leftMax=new int[nums.length];
        int[] rightMin=new int[nums.length];
        leftMax[0] = nums[0];
        rightMin[nums.length-1] = nums[nums.length-1];
        
        for(int i=1;i<nums.length;i++)
        {
            leftMax[i]=Math.max(leftMax[i-1],nums[i]);

        }
        for(int i=nums.length-2;i>=0;i--)
        {
            rightMin[i]=Math.min(rightMin[i+1],nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            int a=0;
            if(leftMax[i] - rightMin[i]<=k)
            {
                return i;
            }
        }
        return -1; 
    }
}
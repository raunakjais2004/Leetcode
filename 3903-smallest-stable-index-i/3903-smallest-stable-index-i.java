class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int i=0;
        int j=0;
        for(i=0;i<nums.length;i++){
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            int a=0;
            for(j=0;j<=i;j++){
                max=Math.max(max,nums[j]);
            }
            for(j=i;j<nums.length;j++){
                min=Math.min(min,nums[j]);
            }
            a=max-min;
            if(a<=k){
                return i;
            }
        }
        return -1;
    }
}
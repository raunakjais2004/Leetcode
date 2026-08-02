class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int area=0;
        int max=0;
        while(right>left)
        {
            area=Math.min(height[left],height[right])*(right-left);
            {
                if(height[left]>height[right])
                {
                    right--;
                }
                else 
                {
                    left++;
                }
            }
            max = Math.max(max, area);
        }
        return max;
    }
}
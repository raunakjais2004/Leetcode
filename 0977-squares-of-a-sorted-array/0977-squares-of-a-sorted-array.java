class Solution {
    public int[] sortedSquares(int[] nums) {
        int a=0;
        int b=nums.length-1;
        int p=nums.length-1;
        int [] ans=new int[nums.length];
        while(a<=b){
            int ls=nums[a]*nums[a];
            int rs=nums[b]*nums[b];
            if(ls>rs){
                ans[p]=ls;
                a++;
            }
            else{
                ans[p]=rs;
                b--;
            }
            p--;
        }
        return ans;


    }
}
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        char l;
        char r;
        while(left<right)
        {
            l=s.charAt(left);
            r=s.charAt(right);
            if(Character.isLetterOrDigit(l)==false)
            {
                left++;
            }
            else if(Character.isLetterOrDigit(r)==false)
            {
                right--;
            }
            else
            {
                if(l==r)  
                {
                    left++;
                    right--;
                }
                else
                {
                    break;
                }
            }
        }
        return (left<right? false:true) ;
        
    }
}
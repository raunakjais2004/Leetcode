class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a = 0;
        int b = 0;
        String ans = "";

        while (a < word1.length() && b < word2.length()) {
            int n = ans.length();

            if (n % 2 == 0) {   
                ans =ans+word1.charAt(a);
                a++;
            } else {           
                ans =ans+word2.charAt(b);
                b++;
            }
        }

        while (a < word1.length()) {
            ans =ans+word1.charAt(a);
            a++;
        }

        while (b < word2.length()) {
            ans =ans+word2.charAt(b);
            b++;
        }

        return ans;
    }
}
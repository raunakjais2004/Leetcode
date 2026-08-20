class Solution {
    public String reverseWords(String s) {

        StringBuilder ans = new StringBuilder();

        int left = s.length() - 1;
        int right = s.length() - 1;

        while (left >= 0) {

            if (s.charAt(left) != ' ') {
                left--;
            } 
            else {

                if (left + 1 <= right) {

                    if (ans.length() > 0) {
                        ans.append(" ");
                    }

                    ans.append(s.substring(left + 1, right + 1));
                }

                right = left - 1;
                left--;
            }
        }

        // Beginning wala word
        if (left < right) {

            if (ans.length() > 0) {
                ans.append(" ");
            }

            ans.append(s.substring(left + 1, right + 1));
        }

        return ans.toString();
    }
}
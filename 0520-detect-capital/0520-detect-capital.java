class Solution {
    public boolean detectCapitalUse(String word) {

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isUpperCase(ch)) {
                count++;
            }
        }

        if (count == 0 || count == word.length()) {
            return true;
        }

        if (count == 1) {
            char a = word.charAt(0);

            if (Character.isUpperCase(a)) {
                return true;
            }
        }

        return false;
    }
}
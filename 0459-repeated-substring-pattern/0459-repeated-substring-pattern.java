class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int len = 1; len <= s.length() / 2; len++){
            if (s.length() % len == 0){
                String pattern = s.substring(0, len);
                String repeated = pattern.repeat(s.length() / len);

                if (repeated.equals(s)) {
                    return true;
}
            }
        }
        return false;
    }
}
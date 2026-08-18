class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int carry=0;
        int i=a.length()-1;
        int j=b.length()-1;

        while(i>=0 || j>=0 || carry!=0) {
            int dA = 0;
            int dB = 0;

            if (i >= 0) {
                dA = a.charAt(i) - '0';
            }
            if (j >= 0) {
                dB = b.charAt(j) - '0';
            }

            int sum=dA+dB+carry;

            int digit = sum % 2;
            carry = sum / 2;

            ans.append(digit);

            i--;
            j--;

        }
        return ans.reverse().toString();

    }
}
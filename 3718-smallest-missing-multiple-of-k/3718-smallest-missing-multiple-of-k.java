class Solution {
    public int missingMultiple(int[] nums, int k) {

        int num = k;

        while (true) {

            int j;

            for (j = 0; j < nums.length; j++) {

                if (num == nums[j]) {
                    break;
                }
            }

            if (j == nums.length) {
                return num;
            }

            num = num + k;
        }
    }
}
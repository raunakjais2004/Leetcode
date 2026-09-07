class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            if (!set.contains(num - 1)) {

                int count = 1;
                int current = num;

                while (set.remove(current + 1)) {
                    count++;
                    current++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        int[] result = new int[k];
        for(int j = 0; j < k; j++) {
            int max=0;
            int key=0;
            for(Integer num : map.keySet()) {
                if(map.get(num) > max) {
                    max = map.get(num);
                    key = num;
                }
            }
            result[j] = key;
            map.put(key, 0);
        }
        return result;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        // 
        List<Integer>[] freq = new List[nums.length + 1];
        // Goes through the array and counts freq
        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0) + 1); 
        }
        // Goes throgh each value we counted
        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                result[index++] = n;
                if (index == k) {
                    return result;
                }
            }
        }
        return result;
    }
}

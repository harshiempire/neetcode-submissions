class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> s = new HashMap<>();
        int ind = 0;
        for(int i:nums){
            s.put(i, ind++);
        }

        for(int i = 0; i<nums.length; i++){
            if(s.containsKey(target-nums[i])){
                if(s.get(target-nums[i]) == i) continue;
                return new int[]{i, s.get(target-nums[i])};
            }
        }
        return new int[]{1,1};
    }
}

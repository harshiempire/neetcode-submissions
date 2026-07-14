class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        int totCount = 0;
        for (int i : nums) {
            if (!set.contains(i - 1)) {
                int x = i;
                int count = 1;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    count++;
                }
                totCount = Math.max(totCount, count);
            }
        }

        return totCount;
    }
}

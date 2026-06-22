class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] in = new ArrayList[nums.length + 1];

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Arrays.fill(in,new ArrayList<Integer>());

        for (int key : map.keySet()) {
            int value = map.get(key);
            if (in[value] == null) {
                in[value] = new ArrayList<>();
            }
            in[value].add(key);
        }

        int[] res = new int[k];
        int ind = 0;
        for (int i = nums.length; i >= 0; i--) {
            if (in[i] == null)
                continue;
            List<Integer> l = in[i];
            int len = l.size();

            for (int j : l) {
                if(ind>=res.length) break;
                res[ind++] = j;
                k--;
                if (k == 0)
                    break;
            }
        }
        return res;
    }
}


class Solution {

    public int[] twoSum(int[] numbers, int target) {
        // TODO: implement using O(1) space
        // Two-pointer approach on the sorted array
        // we need to find two values in the numbers arr(which is sorted) whose sum is
        // equal to target
        //

        int n = numbers.length;
        for (int i = 0, j = n - 1; i < j;) {
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                return new int[] { i+1, j+1 };
            }
        }
        return null;
    }
}

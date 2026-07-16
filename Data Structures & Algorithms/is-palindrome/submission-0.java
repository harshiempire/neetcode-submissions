
class Solution {

    public boolean isPalindrome(String s) {
        // TODO: implement
        // 1. should only consider a-z(not even capital letters) and numbers 0-9

        String x = s.toLowerCase();
        char[] y = x.toCharArray();
        List<Character> l = new ArrayList<>();

        for (char c : y) {
            if (Character.isLetterOrDigit(c)) {
                l.add(c);
            }
        }
        int n = l.size();
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            if (!(l.get(i).equals(l.get(j))))
                return false;
        }
        return true;
    }
}

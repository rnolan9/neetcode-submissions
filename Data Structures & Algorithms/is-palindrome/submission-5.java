class Solution {
    public boolean isPalindrome(String s) {
        String t = s.toLowerCase();
        int left = 0;
        int right = t.length() - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(t.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(t.charAt(right))) {
                right--;
                continue;
            }
            if (t.charAt(left) != t.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        String t = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(t.charAt(left))){
                left++;
            }
            while(right > left && !Character.isLetterOrDigit(t.charAt(right))){
                right--;
            }
            if(t.charAt(left) != t.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

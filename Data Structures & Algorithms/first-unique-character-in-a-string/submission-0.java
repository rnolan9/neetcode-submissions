class Solution {
    public int firstUniqChar(String s) {
        int result = 0;
        int[] count = new int[26];
        for(char letter : s.toCharArray()){
            count[letter - 'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            if(count[letter - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
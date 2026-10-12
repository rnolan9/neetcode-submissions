class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for(char letter : s.toCharArray()){
            count[letter - 'a']++;
        }
        for(char letter : t.toCharArray()){
            count[letter - 'a']--;
        }
        for(int i = 0; i < count.length; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true; 
    }
}

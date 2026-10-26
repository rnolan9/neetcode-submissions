class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ", -1);

        for(int i = 0; i < words.length; i++){
            if(i > 0){
                result.append(' ');
            }
            char[] letters = words[i].toCharArray();
            int right = letters.length - 1;

            while(right >= 0){
                result.append(letters[right]);
                right--;
            }
        }
        return result.toString();
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        // goes through the words in the string array
        for(String word : strs){
            // gives each 26 letters an index
            int[] count = new int[26];
            for(char letter : word.toCharArray()){
                // counts the letter
                count[letter - 'a']++;
            }
            // THIS LINE turn the count array to a string
            String key = Arrays.toString(count);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for (char character : s.toCharArray()) {
            if (closeToOpen.containsKey(character)) {
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(character)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(character);
            }
        }
        return stack.isEmpty();
    }
}
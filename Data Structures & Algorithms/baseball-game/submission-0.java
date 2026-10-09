class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String letter : operations){
            if(letter.equals("+")){
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a + b);
            }
            else if(letter.equals("D")){
                stack.push(stack.peek() * 2);
            }
            else if(letter.equals("C")){
                stack.pop();
            } else {
                stack.push(Integer.parseInt(letter));
            }
        }
        int result = 0;
        for(int score : stack){
            result += score;
        }
        return result;
    }
}
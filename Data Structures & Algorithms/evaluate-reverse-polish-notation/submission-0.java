class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); 
        for(String token : tokens){
            if(token.equals("+")){
                stack.push(stack.pop() + stack.pop());
            } 
            else if(token.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            }
            else if(token.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
            else if(token.equals("/")){
                int c = stack.pop();
                int d = stack.pop();
                stack.push(d / c);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
                continue;
            }
            else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
                continue;
            }
            else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
                continue;
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        
        for(char c : s.toCharArray())
        {
            if(c=='(' || c=='{' || c=='[')
            {
                stack.push(c);
                continue;
            }
            char top = stack.isEmpty()?'|':stack.pop();
            if(c=='}' && top!='{' || (c == ')' && top!='(') || (c==']' && top!='['))
                return false;
        }
        return stack.isEmpty()?true:false;
    }
}
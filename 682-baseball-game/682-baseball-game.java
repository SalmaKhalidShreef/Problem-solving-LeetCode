class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> s = new Stack();
        for(String str :ops){
            if(Character.isDigit(str.charAt(0)))
                s.push(Integer.parseInt(str));
            else if(str.charAt(0)=='-')
                s.push(0-Integer.parseInt(str.substring(1,str.length())));
            else if(str.equals("+")){
                int x = s.pop();
                int z = x+s.peek();
                s.push(x);
                s.push(z);
            }
            else if(str.equals("D"))
                s.push(s.peek()*2);
            else
                s.pop();
        }
        int res=0;
        while(!s.isEmpty())
            res+=s.pop();
        return res;
    }
}
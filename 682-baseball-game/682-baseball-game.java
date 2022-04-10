class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> s = new Stack();
        int res=0;
        for(String str :ops){
            if(Character.isDigit(str.charAt(0))){
                s.push(Integer.parseInt(str));
                res+=s.peek();
            }
            else if(str.charAt(0)=='-'){
                s.push(0-Integer.parseInt(str.substring(1,str.length())));
                res+=s.peek();}
            else if(str.charAt(0)=='+'){
                int x = s.pop();
                int z = x+s.peek();
                res+=z;
                s.push(x);
                s.push(z);
            }
            else if(str.charAt(0)=='D'){
                s.push(s.peek()*2);
                res+=s.peek();
            }
            else{
                res-=s.pop();
            }
        }

        return res;
    }
}
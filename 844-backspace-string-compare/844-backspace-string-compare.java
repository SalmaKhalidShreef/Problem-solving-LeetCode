class Solution {
    public boolean backspaceCompare(String s, String t) {
        int ps=s.length()-1,pt=t.length()-1;
        int skipS=0,skipT=0;
        while(ps>=0 || pt>=0){
            while(ps>=0){
                if(s.charAt(ps)=='#'){skipS++;ps--;}
                else if(skipS>0){skipS--;ps--;}
                else break;
            }
            while(pt>=0){
                if(t.charAt(pt)=='#'){skipT++;pt--;}
                else if(skipT>0){skipT--;pt--;}
                else break;
            }
            if(pt>=0&&ps>=0&&t.charAt(pt)!=s.charAt(ps))
                return false;
            if((ps>=0)!=(pt>=0))
                return false;
                pt--;ps--;
            
        }
        return true;
    }
}
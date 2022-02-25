class Solution {
    public int compareVersion(String version1, String version2) {
        String [] v1 = version1.split("\\.");
        String [] v2 = version2.split("\\.");
        int i =0;
        int j =0;
        int s1= 0;
        int s2=0;
        boolean flag = false;
        while(i<v1.length && j <v2.length){
            int ii=0;
            int jj=0;
            s1=0;
            s2=0;
                s1+=Integer.parseInt(v1[i]);
            i++;
                s2+=Integer.parseInt(v2[j]);
            j++;
            
            if(s1!=s2){
                flag = true;
                System.out.println("hena");

                break;
            }
            

        }
         if(flag){
             int res =s1>s2?1:s1<s2?-1:0;
             return res;  
            }
        while(i<v1.length){
            s1+=Integer.parseInt(v1[i]);

            i++; 
        }
        while(j<v2.length){
            s2+=Integer.parseInt(v2[j]);
            j++;
        }
int res =s1>s2?1:s1<s2?-1:0;
             return res;  
        
    }
}
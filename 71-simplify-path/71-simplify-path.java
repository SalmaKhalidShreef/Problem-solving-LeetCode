class Solution {
       public String simplifyPath(String path) {
        List<String> paths = new ArrayList<>(path.length());
        int i = -1;
        for(String folder : path.split("/")){
            if(folder.equals("..")){
                if(!paths.isEmpty()){
                    paths.remove(i);
                    i --;   
                }
            }else if(!folder.isEmpty() && !folder.equals(".")){
                paths.add(folder);
                i++;
            }
            
        }
        return "/"+String.join("/", paths);
        
    }
}
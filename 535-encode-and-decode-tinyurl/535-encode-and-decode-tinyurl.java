public class Codec {
    HashMap<String,String> map;
    
    public Codec(){
        map = new HashMap();
         StringBuilder shortURL=new StringBuilder();

    }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        
        StringBuilder shortURL=new StringBuilder();
        
        for(int i=0;i<2;i++)
            shortURL.append((char)Math.floor(Math.random()*128));     
        
        while(map.containsKey(shortURL))
            shortURL.setCharAt(shortURL.length()-1,(char)Math.floor(Math.random()*128));
        
        map.put(shortURL.toString(),longUrl);
        return shortURL.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
/*
    length of the URL is from 1 to 10^4
    
*/
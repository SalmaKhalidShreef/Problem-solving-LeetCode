public class Codec {
    HashMap<String,String> map;
    
    public Codec(){
        map = new HashMap();
         StringBuilder shortURL=new StringBuilder();

    }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int i=longUrl.length();
        StringBuilder shortURL=new StringBuilder();
        while(i>=longUrl.length()){
            char c = (char)Math.floor(Math.random()*128);
            shortURL.append(c);
            i=i/128;
        }
        while(map.containsKey(shortURL)){
            char c = (char)Math.floor(Math.random()*128);
            shortURL.setCharAt(shortURL.length()-1,c);
        }
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
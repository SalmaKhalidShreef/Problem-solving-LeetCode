class MyHashMap {
    boolean[] mapKey;
    int[] val;
    public MyHashMap() {
        mapKey=new boolean[(10*10*10*10*10*10)+1];
        val = new int[mapKey.length];
    }
    
    public void put(int key, int value) {
        mapKey[key]=true;
        val[key]=value;
    }
    
    public int get(int key) {
        return mapKey[key]==false?-1:val[key];
    }
    
    public void remove(int key) {
        mapKey[key]=false;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
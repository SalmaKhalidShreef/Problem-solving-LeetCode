class MyHashSet {
        boolean[] set;
    public MyHashSet() {
        int size=10*10*10*10*10*10;
        this.set=new boolean[size+1];
       // System.out.println(set.length);
    }
    
    public void add(int key) {
        set[key]=true;
    }
    
    public void remove(int key) {
        set[key]=false;
    }
    
    public boolean contains(int key) {
        return set[key];
    }


}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
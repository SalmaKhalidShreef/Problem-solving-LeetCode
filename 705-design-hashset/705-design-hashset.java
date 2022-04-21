class MyHashSet {
        int[] set;
        boolean zero;
    public MyHashSet() {
        int size=10*10*10*10*10*10;
        zero=false;
        this.set=new int[size+1];
        System.out.println(set.length);
    }
    
    public void add(int key) {
        if(key==0)
            zero=true;
        set[key]=key;
    }
    
    public void remove(int key) {
        if(key==0)
            zero=false;
        set[key]=-1;
    }
    
    public boolean contains(int key) {
        if(key==0)
            return zero;
        return set[key]==key;
    }


}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
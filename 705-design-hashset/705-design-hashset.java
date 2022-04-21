class MyHashSet {
        ArrayList<Integer> set;
    public MyHashSet() {
        this.set=new ArrayList();
    }
    
    public void add(int key) {
        set.add(key);
    }
    
    public void remove(int key) {
        set.removeIf(num->num==key);
        System.out.println(set.contains(key));
    }
    
    public boolean contains(int key) {
        return set.contains(key);
    }

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
class MyHashSet {

    private Bucket[] bucketArray;
    private int keyrange;
    
    public MyHashSet() {
        this.keyrange = 769;
        bucketArray = new Bucket[this.keyrange];
        for(int i = 0; i<this.keyrange; ++i)
            this.bucketArray[i] = new Bucket(); 
    }
    
    private int _hash(int key){
        return key % this.keyrange;
    }
    
    public void add(int key) {
        int index = _hash(key);
        this.bucketArray[index].insertIntoBucket(key);
    }
    
    public void remove(int key) {
        int index = _hash(key);
        this.bucketArray[index].deleteFromBucket(key);
    }
    
    public boolean contains(int key) {
        int index = _hash(key);
        return this.bucketArray[index].contains(key);
    }
}

class Bucket{
    
    private BSTree tree;
    
    public Bucket(){
        this.tree =  new BSTree();
    }
    
    public void insertIntoBucket(int key){
        this.tree.root = this.tree.insertIntoBST(this.tree.root, key);
    }
    
    public void deleteFromBucket(int key){
        this.tree.root = this.tree.deleteFromBST(this.tree.root, key);
    }
    
    public boolean contains(int key){
        TreeNode node = this.tree.searchBST(this.tree.root, key);
        return (node != null);
    }
}

class TreeNode{
    
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val){
        this.val=val;
    }
}

class BSTree{
    
    TreeNode root = null;
    
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val == val)
            return root;
        
        return root.val > val ? searchBST(root.left,val) : searchBST(root.right,val);
    }
    
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null)
            return new TreeNode(val);
        
        if(root.val > val)
            root.left = insertIntoBST(root.left,val);
        else if(root.val < val)
            root.right = insertIntoBST(root.right,val);
        else 
            return root;
        
        return root;
    }
    
    public int predecessor(TreeNode root){
        root = root.left;
        while(root.right != null)
            root = root.right;
        
        return root.val;
    }
    
    public int successor(TreeNode root){
       root = root.right;
        while(root.left != null)
            root = root.left;
        
        return root.val;
    }
    
    public TreeNode deleteFromBST(TreeNode root, int val) {
        if(root == null)
            return root;
        
        if(val < root.val)
            root.left = deleteFromBST(root.left, val);
        else if(val > root.val)
            root.right = deleteFromBST(root.right, val);
        else if(val == root.val){
            if(root.left == null && root.right == null)
                root = null;
            else if(root.right != null){
                root.val = successor(root);
                root.right = deleteFromBST(root.right, root.val);
            }
            else{
                root.val = predecessor(root);
                root.right = deleteFromBST(root.right, root.val);
            }
        }
        
        return root;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
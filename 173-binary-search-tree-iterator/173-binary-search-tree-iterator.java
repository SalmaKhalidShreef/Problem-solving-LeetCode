class BSTIterator {

    private List<TreeNode> list;
    private int position;
    
    public BSTIterator(TreeNode root) {
        list = new ArrayList<>();
        position = -1;
        
        inOrder(root);
    }
    
    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        
        inOrder(root.left);
        list.add(root);
        inOrder(root.right);
    }
    
    public int next() {
        return list.get(++position).val;
    }
    
    public boolean hasNext() {
        return position < list.size() - 1;
    }
}

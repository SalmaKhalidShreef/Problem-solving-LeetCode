/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    static HashMap<Integer,Node> visited;
     public Node cloneGraph(Node node) {
         visited = new HashMap();
        
        return clone(node);
    }
    public Node clone(Node node){
        if (node == null) return null;
        if(visited.containsKey(node.val))
            return visited.get(node.val);

        Node newNode = new Node(node.val);
                visited.put(node.val,newNode);

        for(int i =0;i<node.neighbors.size();i++){
           newNode.neighbors.add(clone(node.neighbors.get(i)));
        }
        
        return newNode;
    }
}
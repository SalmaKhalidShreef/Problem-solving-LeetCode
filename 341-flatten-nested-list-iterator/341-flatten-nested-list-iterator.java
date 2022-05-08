/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    int i;
    List<Integer>list;
    public NestedIterator(List<NestedInteger> nestedList) {
        list=new ArrayList();
        for(int j=0;j<nestedList.size();j++)
            add(nestedList.get(j));
    }
    public void add(NestedInteger ni){
        if(ni.isInteger())
        {
            list.add(ni.getInteger());
            return;
        }
        else{
            for(int j=0;j<ni.getList().size();j++){
                    add(ni.getList().get(j));
            }
        }
    }
    @Override
    public Integer next() {
        return list.get(i++);
    }

    @Override
    public boolean hasNext() {
        return i>=list.size()?false:true;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
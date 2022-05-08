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
        add(nestedList);
    }
    public void add(List<NestedInteger> ni){
        if(ni==null)
        {
            return;
        }
        else{
            for(NestedInteger nii:ni)
            if(nii.isInteger())
                list.add(nii.getInteger());
            else add(nii.getList());
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
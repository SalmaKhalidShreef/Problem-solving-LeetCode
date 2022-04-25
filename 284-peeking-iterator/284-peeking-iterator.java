// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> myIterator;
    Integer myNext;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.myIterator=iterator;
        myNext = myIterator.hasNext()?myIterator.next():-1;
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return myNext;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        Integer tmp = myNext;
        //System.out.println(myIterator);
        myNext=myIterator.hasNext()?myIterator.next():null;
	    return tmp;
	}
	
	@Override
	public boolean hasNext() {
        if(myNext!=null)
            return true;
	    return myIterator.hasNext();
	}
}
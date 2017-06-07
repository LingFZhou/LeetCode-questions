import java.util.Iterator;
//2017-3-26
class PeekingIterator implements Iterator<Integer> {
	private Integer next = null;
	private Iterator<Integer> ite;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    ite = iterator;
	    if(iterator.hasNext())
	    	next = ite.next();
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return next;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer res = next;
	    next = ite.hasNext()?ite.next():null;
	    return res;
	}

	@Override
	public boolean hasNext() {
	    return next!=null;
	}
}

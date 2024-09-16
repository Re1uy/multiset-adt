/**
 * Abstract class representing a MultiSet ADT.
 */
public abstract class MultiSet {

    /**
     * Add the given item to this multiset.
     * o8y7gouygiuy
     * @param item the item to add
     */
    abstract void add(Integer item);
    abstract void remove();

    abstract boolean contains(Integer item);

    abstract boolean isEmpty();

    abstract int count(Integer item);

    abstract int size();
}


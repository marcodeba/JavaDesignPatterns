package iterator.iterator;

import iterator.aggregate.Aggregate;
import iterator.aggregate.ListAggregate;

import java.util.Iterator;

/**
 * Created by marcopan on 17/4/7.
 */
public class ListIterator implements Iterator {
    Aggregate list = new ListAggregate();
    int index = 0;

    public ListIterator(Aggregate arrays) {
        this.list = arrays;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return (index < list.getLength());
    }

    @Override
    public Object next() {
        return list.get(index++);
    }
}

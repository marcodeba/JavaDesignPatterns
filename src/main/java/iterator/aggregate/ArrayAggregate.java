package iterator.aggregate;

import iterator.iterator.ArrayIterator;
import iterator.Book;

import java.util.Iterator;

/**
 * 具体集合类
 */
public class ArrayAggregate implements Aggregate {
    Book[] books = null;
    int index = 0;

    public ArrayAggregate(int maxium) {
        books = new Book[maxium];
    }

    @Override
    public Book get(int index) {
        return books[index];
    }

    @Override
    public void append(Book newBook) {
        books[index++] = newBook;
    }

    @Override
    public int getLength() {
        return index;
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(this);
    }
}

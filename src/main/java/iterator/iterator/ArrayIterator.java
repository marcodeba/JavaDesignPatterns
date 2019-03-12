package iterator.iterator;

import iterator.Book;
import iterator.aggregate.Aggregate;

import java.util.Iterator;

/**
 * 具体迭代类，Iterator是抽象迭代类
 */
public class ArrayIterator implements Iterator {
    private Aggregate books;
    private int index = 0;

    public ArrayIterator(Aggregate books) {
        this.books = books;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < books.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = (Book) books.get(index++);
        return book;
    }
}

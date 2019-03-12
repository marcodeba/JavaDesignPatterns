package iterator.aggregate;

import iterator.Book;
import iterator.iterator.ListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListAggregate implements Aggregate {
    List<Book> books;

    public ListAggregate() {
        books = new ArrayList<Book>();
    }

    @Override
    public void append(Book book) {
        books.add(book);
    }

    @Override
    public Book get(int index) {
        return books.get(index);
    }

    @Override
    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator createIterator() {
        return new ListIterator(this);
    }
}

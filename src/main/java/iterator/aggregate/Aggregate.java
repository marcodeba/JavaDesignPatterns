package iterator.aggregate;

import iterator.Book;

import java.util.Iterator;

/**
 * 抽象集合类，创建抽象迭代类
 */
public interface Aggregate {

    Iterator createIterator();

    void append(Book book);

    Object get(int index);

    int getLength();
}

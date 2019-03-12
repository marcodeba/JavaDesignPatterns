package iterator;

import iterator.aggregate.Aggregate;
import iterator.aggregate.ArrayAggregate;

import java.util.Iterator;

/**
 * Created by marcopan on 17/4/7.
 */
public class Client {
    public static void main(String[] args) {
        Aggregate array = new ArrayAggregate(4);
        array.append(new Book("a"));
        array.append(new Book("b"));
        array.append(new Book("c"));
        array.append(new Book("d"));

        /*Aggregate list = new ListAggregate();
        list.append(new Book("a"));
        list.append(new Book("b"));
        list.append(new Book("c"));
        list.append(new Book("d"));*/

        Iterator it = array.createIterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}

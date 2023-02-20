package iterator;

public class BookShelf implements Aggregate {

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public Book getBook(int index) {
        return books[index];
    }

    @Override
    public Iterator iterator() {
        return new IteratorFactory().create(this, 0);
    }

    @Override
    public Iterator reverseIterator() {
        return new IteratorFactory().create(this, 1);
    }

    @Override
    public int getLength() {
        return last;
    }
}

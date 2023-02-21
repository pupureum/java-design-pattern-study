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
        return new BookShelfIterator(this);
    }

    @Override
    public Iterator reverseIterator() {
        return new BookShelfReverseIterator(this);
    }

    @Override
    public int getLength() {
        return last;
    }
}

package iterator;

public class BookShelfReverseIterator implements Iterator {

    private BookShelf bookShelf;

    private int position;

    public BookShelfReverseIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.position = bookShelf.getLength() - 1;
    }

    @Override
    public boolean hasNext() {
        return position >= 0;
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBook(position);
        position--;
        return book;
    }
}

package iterator;

public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    int position = 0;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        if (position >= bookShelf.getLength() || bookShelf.getBook(position) == null) {
            return false;
        }
        return true;
    }

    @Override
    public Book next() {
        Book book = bookShelf.getBook(position);
        position++;
        return book;
    }
}

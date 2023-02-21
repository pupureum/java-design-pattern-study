package iterator;

public class IteratorFactory extends Factory {

    private static final int FORWARD = 0;

    @Override
    protected Iterator createProduct(Aggregate list, int type) {
        if (type == FORWARD) {
            return list.iterator();
        }
        return list.reverseIterator();
    }
}

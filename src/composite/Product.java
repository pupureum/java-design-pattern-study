package composite;

public class Product extends ProductCategory {

    private static final int count = 1;

    public Product(int id, String name, int price) {
        super(id, name, price);
    }

    @Override
    public void addProduct(ProductCategory product) {
    }

    @Override
    public void removeProduct(ProductCategory product) {
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getId() {
        return id;
    }
}

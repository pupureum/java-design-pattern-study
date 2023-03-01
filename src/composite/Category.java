package composite;

import java.util.ArrayList;

public class Category extends ProductCategory{
    private ArrayList<ProductCategory> categories;
    public Category(int id, String name, int price) {
        super(id, name, price);
        categories = new ArrayList<>();
    }

    @Override
    public void addProduct(ProductCategory product) {
        categories.add(product);
    }

    @Override
    public void removeProduct(ProductCategory product) {
        categories.remove(product);
    }

    @Override
    public int getCount() {
        int count = 0;
        for (ProductCategory category : categories) {
            count += category.getCount();
        }
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

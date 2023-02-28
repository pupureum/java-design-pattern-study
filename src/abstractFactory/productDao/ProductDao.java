package abstractFactory.productDao;

import abstractFactory.Product;

public abstract class ProductDao {
    public abstract void insertProduct(Product product);
    public abstract void updateProduct(Product product);
    public abstract void deleteProduct(Product product);
}

package abstractFactory.productDao;

import abstractFactory.Product;
import java.util.ArrayList;
import java.util.Arrays;

public class ProductMySqlDao extends ProductDao{
    private ArrayList<Product> mySqlDB = new ArrayList<>();
    @Override
    public void insertProduct(Product product) {
        mySqlDB.add(product);
        System.out.println("Insert User Info [" + product.getProductName() + "] in MySql");
    }

    @Override
    public void updateProduct(Product product) {
        for (Product productItem : mySqlDB) {
            if (productItem.getProductId().equals(product.getProductId())) {
                productItem.setProductName(product.getProductName());
            }
        }
        System.out.println("Update User Info [" + product.getProductName() + "] in MySql");
    }

    @Override
    public void deleteProduct(Product product) {
        for (Product productItem : mySqlDB) {
            if (productItem.getProductId().equals(product.getProductId())) {
                mySqlDB.remove(product);
                break;
            }
        }
        System.out.println("Delete User Info [" + product.getProductName() + "] in MySql");
    }
}

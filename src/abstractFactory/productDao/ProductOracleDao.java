package abstractFactory.productDao;

import abstractFactory.Product;
import java.util.ArrayList;

public class ProductOracleDao extends ProductDao {

    private ArrayList<Product> oracleDB = new ArrayList<>();

    @Override
    public void insertProduct(Product product) {
        oracleDB.add(product);
        System.out.println("Insert User Info [" + product.getProductName() + "] in Oracle");
    }

    @Override
    public void updateProduct(Product product) {
        for (Product productItem : oracleDB) {
            if (productItem.getProductId().equals(product.getProductId())) {
                productItem.setProductName(product.getProductName());
            }
        }
        System.out.println("Update User Info [" + product.getProductName() + "] in Oracle");
    }

    @Override
    public void deleteProduct(Product product) {
        for (Product productItem : oracleDB) {
            if (productItem.getProductId().equals(product.getProductId())) {
                oracleDB.remove(product);
                break;
            }
        }
        System.out.println("Delete User Info [" + product.getProductName() + "] in Oracle");
    }
}

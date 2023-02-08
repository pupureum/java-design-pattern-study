package factory;

public class Car implements CarInterface {

    private String productName;

    public Car(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return this.productName;
    }
}
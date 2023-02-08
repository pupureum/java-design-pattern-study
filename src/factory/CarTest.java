package factory;

public class CarTest {

    public static void main(String[] args) {
        CarTest test = new CarTest();

        CarInterface sonata = test.produceCar("Sonata");
        System.out.println(sonata);

        CarInterface grandeur = test.produceCar("Grandeur");
        System.out.println(grandeur);

        CarInterface genesis = test.produceCar("Genesis");
        System.out.println(genesis);

        CarInterface testCar = test.produceCar("TestCar");
    }

    public CarInterface produceCar(String name) {
        CarInterface car = null;
        if (name.equalsIgnoreCase(Sonata.PRODUCT_NAME)) {
            car = new SonataFactory().createCar();
        } else if (name.equalsIgnoreCase(Grandeur.PRODUCT_NAME)) {
            car = new GrandeurFactory().createCar();
        } else if (name.equalsIgnoreCase(Genesis.PRODUCT_NAME)) {
            car = new GenesisFactory().createCar();
        } else {
            System.out.println("This model does not exist!");
        }
        return car;
    }
}

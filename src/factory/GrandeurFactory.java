package factory;

public class GrandeurFactory implements CarFactory {

    @Override
    public CarInterface createCar() {
        return new Grandeur();
    }
}

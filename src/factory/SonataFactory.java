package factory;

public class SonataFactory implements CarFactory{

    @Override
    public CarInterface createCar() {
        return new Sonata();
    }
}

package factory;

public class GenesisFactory implements CarFactory {

    @Override
    public CarInterface createCar() {
        return new Genesis();
    }
}

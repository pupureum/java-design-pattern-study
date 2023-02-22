package observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();
    private int number;

    public void pickNumber() {
        this.number = random.nextInt(42);
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        pickNumber();
        notifyObservers();
    }
}

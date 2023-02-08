package decorator;

public class Milk extends CondimentDecorator {

    private static final String MILK = " Adding Milk";

    public Milk(Coffee coffee) {
        super(coffee);
        this.description += MILK;
    }
}

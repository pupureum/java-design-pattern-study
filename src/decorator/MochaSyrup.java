package decorator;

public class MochaSyrup extends CondimentDecorator {

    private static final String MOCHA_SYRUP = " Adding Mocha Syrup";

    public MochaSyrup(Coffee coffee) {
        super(coffee);
        this.description += MOCHA_SYRUP;
    }
}

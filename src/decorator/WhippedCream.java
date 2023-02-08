package decorator;

public class WhippedCream extends CondimentDecorator {

    private static final String WHIPPED_CREAM = " Adding WhippedCream";

    public WhippedCream(Coffee coffee) {
        super(coffee);
        this.description += WHIPPED_CREAM;
    }
}

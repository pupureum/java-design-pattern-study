package decorator;

public abstract class CondimentDecorator extends Coffee {

    private Coffee coffee;

    public CondimentDecorator(Coffee coffee) {
        super(coffee.bean);
        this.coffee = coffee;
        this.description = coffee.description;
    }
}

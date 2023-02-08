package decorator;

public class Coffee {
    private static final String AMERICANO = "Americano";

    protected Bean bean;
    protected String description = "";

    public Coffee(Bean bean) {
        this.bean = bean;
    }

    public String getDescription() {
        return bean.getName() + AMERICANO + this.description;
    }
}

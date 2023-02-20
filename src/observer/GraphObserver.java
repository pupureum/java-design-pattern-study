package observer;

public class GraphObserver implements Observer{

    private int number;
    @Override
    public void update(NumberGenerator generator) {
        number = generator.getNumber();
        display();
    }

    public void display() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("graph observer: ");
        for (int i = 0; i < number; i++) {
            stringBuilder.append("☁︎");
        }
        System.out.println(stringBuilder);
    }
}

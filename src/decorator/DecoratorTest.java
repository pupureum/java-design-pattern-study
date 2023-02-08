package decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        Bean kenya = new Bean("Kenya");
        Bean etiopia = new Bean("Etiopia");

        Coffee kenyaAmericano = new Coffee(kenya);
        System.out.println(kenyaAmericano.getDescription());

        Coffee kenyaLatte = new Milk(kenyaAmericano);
        System.out.println(kenyaLatte.getDescription());

        Coffee KenyaMochaLatte = new MochaSyrup(kenyaLatte);
        System.out.println(KenyaMochaLatte.getDescription());

        Coffee KenyaMochaLatteWhippedCream = new WhippedCream(KenyaMochaLatte);
        System.out.println(KenyaMochaLatteWhippedCream.getDescription());

        Coffee etiopiaLatte = new Milk(new Coffee(etiopia));
        System.out.println(etiopiaLatte.getDescription());
    }
}

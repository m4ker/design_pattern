package creation.abstractFactory;

public class Client {

    public static void main(String[] args) {

        Factory concreteFactory = Factory.createFactory("type1");
        Product1 concreteProduct1 = concreteFactory.createProduct1();
        Product2 concreteProduct2 = concreteFactory.createProduct2();

    }
}

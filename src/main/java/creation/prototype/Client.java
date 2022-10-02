package creation.prototype;

public class Client {

    public static void main(String[] args) {
        ConcretePrototype1 concretePrototype1 = new ConcretePrototype1();
        concretePrototype1.setProperty1("pro1");

        ConcretePrototype1 cloned = concretePrototype1.clone();
    }
}

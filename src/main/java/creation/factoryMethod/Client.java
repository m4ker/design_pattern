package creation.factoryMethod;

import creation.factoryMethod.creator.ConcreteCreator1;

public class Client {

    public static void main(String[] args) {

        Creator creator1 = new ConcreteCreator1();
        creator1.operation1();

    }
}

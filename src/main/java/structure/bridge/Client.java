package structure.bridge;

import structure.bridge.abstraction.RefineAbstraction;
import structure.bridge.implementor.ConcreteImplementorA;
import structure.bridge.implementor.ConcreteImplementorB;

public class Client {
    public static void main(String[] args) {

        Implementor implementorA = new ConcreteImplementorA();
        Abstraction abstractionWithA = new RefineAbstraction(implementorA);
        abstractionWithA.operation();

        Implementor implementorB = new ConcreteImplementorB();
        Abstraction abstractionWithB = new RefineAbstraction(implementorB);
        abstractionWithB.operation();
    }
}

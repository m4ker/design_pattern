package creation.factoryMethod.creator;

import creation.factoryMethod.Creator;
import creation.factoryMethod.Product;
import creation.factoryMethod.product.ConcreteProduct2;

public class ConcreteCreator2 extends Creator {
    @Override
    protected Product factoryMethod() {
        return new ConcreteProduct2();
    }
}

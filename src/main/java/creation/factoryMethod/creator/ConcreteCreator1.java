package creation.factoryMethod.creator;

import creation.factoryMethod.product.ConcreteProduct1;
import creation.factoryMethod.Creator;
import creation.factoryMethod.Product;

public class ConcreteCreator1 extends Creator {
    @Override
    protected Product factoryMethod() {
        return new ConcreteProduct1();
    }
}

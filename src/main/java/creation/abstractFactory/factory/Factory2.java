package creation.abstractFactory.factory;

import creation.abstractFactory.Factory;
import creation.abstractFactory.Product1;
import creation.abstractFactory.Product2;
import creation.abstractFactory.product.factory2.Factory2Product1;
import creation.abstractFactory.product.factory2.Factory2Product2;

public class Factory2 implements Factory {
    @Override
    public Product1 createProduct1() {
        return new Factory2Product1();
    }

    @Override
    public Product2 createProduct2() {
        return new Factory2Product2();
    }
}

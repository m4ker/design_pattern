package creation.abstractFactory.factory;

import creation.abstractFactory.Factory;
import creation.abstractFactory.Product1;
import creation.abstractFactory.Product2;
import creation.abstractFactory.product.factory1.Factory1Product1;
import creation.abstractFactory.product.factory1.Factory1Product2;

public class Factory1 implements Factory {
    @Override
    public Product1 createProduct1() {
        return new Factory1Product1();
    }

    @Override
    public Product2 createProduct2() {
        return new Factory1Product2();
    }
}

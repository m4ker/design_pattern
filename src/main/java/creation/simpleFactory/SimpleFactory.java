package creation.simpleFactory;

import creation.simpleFactory.product.ConcreteProduct1;
import creation.simpleFactory.product.ConcreteProduct2;

public class SimpleFactory {

    public static Product createProduct(String type) {
        if ("type1".equals(type)) {
            return new ConcreteProduct1();
        } else if ("type2".equals(type)) {
            return new ConcreteProduct2();
        } else {
            throw new IllegalArgumentException("invalid factory type");
        }
    }
}

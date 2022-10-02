package creation.abstractFactory;

import creation.abstractFactory.factory.Factory1;
import creation.abstractFactory.factory.Factory2;

public interface Factory {

    // 这是一个SimpleFactory模式
    public static Factory createFactory(String type) {
        if ("type1".equals(type.toLowerCase())) {
            return new Factory1();
        } else if ("type2".equals(type.toLowerCase())) {
            return new Factory2();
        } else {
            throw new IllegalArgumentException("invalid factory type");
        }
    }

    Product1 createProduct1();

    Product2 createProduct2();
}

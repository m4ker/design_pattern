package creation.builder;

import creation.abstractFactory.Product1;
import creation.builder.builder.Product1Builder;

public class Client {

    public static void main(String[] args) {
        Builder builder = new Product1Builder();
        Director<Product1> director = new Director<>(builder);
        Product1 product = director.construct();
    }
}

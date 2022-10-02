package creation.builder.builder;

import creation.builder.Builder;
import creation.builder.product.Product1;

public class Product1Builder extends Builder {

    private Product1 product = new Product1();

    public void buildPart1() {
        product.setPart1("part1");
    }

    public void buildPart2() {
        product.setPart1("part2");
    }

    public void buildPart3() {
        product.setPart1("part3");
    }

    @Override
    public Object getProduct() {
        return product;
    }


}

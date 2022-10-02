package creation.builder.builder;

import creation.builder.Builder;
import creation.builder.product.Product1;
import creation.builder.product.Product2;

public class Product2Builder extends Builder {

    private Product2 product = new Product2();

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

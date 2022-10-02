package creation.builder;

public class Director<T> {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public T construct() {
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart3();
        return (T)builder.getProduct();
    }
}

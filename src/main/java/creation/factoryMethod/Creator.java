package creation.factoryMethod;

public abstract class Creator {

    //private List<Product> products = new ArrayList<>();

    protected abstract Product factoryMethod();

    public void operation1() {
        Product product = factoryMethod();
        //products.add(product);
        // do something
    }
}

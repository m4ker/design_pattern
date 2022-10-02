package creation.prototype;

public class ConcretePrototype1 implements Cloneable {

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    private String property1;

    @Override
    public ConcretePrototype1 clone() {

        ConcretePrototype1 cloned = new ConcretePrototype1();
        cloned.setProperty1(property1);

        return cloned;
    }
}

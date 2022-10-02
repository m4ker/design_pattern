package creation.prototype;

public class ConcretePrototype2 implements Cloneable {
    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    private String property1;

    @Override
    public ConcretePrototype2 clone() {

        ConcretePrototype2 cloned = new ConcretePrototype2();
        cloned.setProperty1(property1);

        return cloned;
    }
}

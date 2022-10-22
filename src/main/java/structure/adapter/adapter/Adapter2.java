package structure.adapter.adapter;

import structure.adapter.Target;
import structure.adapter.adaptee.Adaptee;

// 对象适配器，使用委托实现适配器
public class Adapter2 implements Target {

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}

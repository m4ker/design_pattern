package structure.adapter.adapter;

import structure.adapter.Target;
import structure.adapter.adaptee.Adaptee;

// 类适配器，继承被适配类，并实现标准接口
public class Adapter1 extends Adaptee implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}

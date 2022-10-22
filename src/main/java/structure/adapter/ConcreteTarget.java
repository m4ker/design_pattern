package structure.adapter;

import structure.adapter.adaptee.Adaptee;
import structure.adapter.adapter.Adapter1;
import structure.adapter.adapter.Adapter2;

// 实现标准接口的普通类
public class ConcreteTarget implements Target {
    @Override
    public void request() {

        // 普通功能
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        // 经过适配的特殊功能
        Target adapter = new Adapter1();
        adapter.request();

        Target adapter2 = new Adapter2(new Adaptee());
        adapter2.request();
    }
}

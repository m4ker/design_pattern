package creation.singleton;

public class SimpleSingleton {

    private static final SimpleSingleton INSTANCE = new SimpleSingleton();

    public static SimpleSingleton getInstance() {
        return INSTANCE;
    }

    // 防止使用构造函数进行实例化
    private SimpleSingleton() {

    }
}

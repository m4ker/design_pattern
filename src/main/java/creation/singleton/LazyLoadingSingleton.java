package creation.singleton;

public class LazyLoadingSingleton {
    private static LazyLoadingSingleton INSTANCE = null;

    public static LazyLoadingSingleton getInstance() {
        if (INSTANCE == null) {
            // 需要加锁保证线程安全
            synchronized (LazyLoadingSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyLoadingSingleton();
                }
            }
        }
        return INSTANCE;
    }

    // 防止使用构造函数进行实例化
    private LazyLoadingSingleton() {

    }
}

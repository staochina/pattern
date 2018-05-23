package singleton;

/**
 * 单例模式
 * 静态内部类
 * 原理：静态内部类在被调用时才会被加载
 * Created by sun.tao on 2018/1/8.
 */
public class ClassSingleton {
    private ClassSingleton() {
    }

    public static ClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 静态内部类
     * 在内部类中实例化
     */
    private static class SingletonHolder {
        private static final ClassSingleton INSTANCE = new ClassSingleton();
        static {
            System.out.println("instanced");
        }
    }
}

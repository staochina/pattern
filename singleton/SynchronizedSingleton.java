package singleton;

/**
 * 单例模式
 * 双重锁机制
 * Created by sun.tao on 2018/1/8.
 */
public class SynchronizedSingleton {
    private static SynchronizedSingleton INSTANCE;

    private SynchronizedSingleton(){
    }

    public static SynchronizedSingleton getInstance (){
        if(null == INSTANCE){
            synchronized (SynchronizedSingleton.class){
                if(null == INSTANCE){
                    INSTANCE = new SynchronizedSingleton();
                }
            }
        }
        return INSTANCE;
    }
}

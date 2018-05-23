package singleton;

/**
 * ����ģʽ
 * ��̬�ڲ���
 * ԭ����̬�ڲ����ڱ�����ʱ�Żᱻ����
 * Created by sun.tao on 2018/1/8.
 */
public class ClassSingleton {
    private ClassSingleton() {
    }

    public static ClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * ��̬�ڲ���
     * ���ڲ�����ʵ����
     */
    private static class SingletonHolder {
        private static final ClassSingleton INSTANCE = new ClassSingleton();
        static {
            System.out.println("instanced");
        }
    }
}

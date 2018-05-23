package adapter.classadapter;

/**
 * Desc:
 * Created by sun.tao on 2018/5/23
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}

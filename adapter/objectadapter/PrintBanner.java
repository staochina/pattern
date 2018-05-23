package adapter.objectadapter;

/**
 * Desc:
 * Created by sun.tao on 2018/5/23
 */
public class PrintBanner implements Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParent();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}

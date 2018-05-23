package adapter.classadapter;

/**
 * Desc:
 * Created by sun.tao on 2018/5/23
 */
public class PrintBanner extends Banner implements Print{
    public PrintBanner(String string){
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParent();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}

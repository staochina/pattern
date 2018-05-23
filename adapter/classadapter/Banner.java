package adapter.classadapter;

/**
 * Desc:
 * Created by sun.tao on 2018/5/23
 */
public class Banner {
    private String string;
    public Banner(String string){
        this.string = string;
    }

    public void showWithParent(){
        System.out.println("(" + string + ")");
    }

    public void showWithAster(){
        System.out.println("*" + string+ "*");
    }
}

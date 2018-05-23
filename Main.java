import java.util.Locale;

/**
 * Desc:
 * Created by sun.tao on 2018/5/8
 */
public class Main {
    public static void main(String[] args){
        Locale temp = new Locale("en","US");
        System.out.println(Locale.SIMPLIFIED_CHINESE.toString());
        System.out.println(temp.getDisplayName(temp));
    }
}

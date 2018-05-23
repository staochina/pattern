package singleton;

public class Main {
    public static void main(String[] args) {
        ClassSingleton instance11 = ClassSingleton.getInstance();
        ClassSingleton instance12 = ClassSingleton.getInstance();
        System.out.println(instance11 == instance12);
    }
}

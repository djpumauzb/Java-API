package Leksiya.less3;

public class obj {
    public static void main(String[] args) {
        Object o = 1;
        GetType(o);
        o = 1.2;
        GetType(o);
    }

    private static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }

}
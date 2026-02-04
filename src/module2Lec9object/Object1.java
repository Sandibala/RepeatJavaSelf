package module2Lec9object;

import java.lang.reflect.Method;
import java.util.List;

public class Object1 {
    public static void main(String[] args) {
        Object o = new Object();
        o.getClass();
        o.toString();
        System.out.println(o);
        Class[] interfaces = List.class.getInterfaces();
        Class parent = String.class.getSuperclass();
        Method[] methods = List.class.getMethods();
        System.out.println(interfaces);
        System.out.println(parent);
        System.out.println(methods);


    }
}

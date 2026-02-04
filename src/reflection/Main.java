package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Person p = new Person();
        p.setName("Doe");
        Class cl = p.getClass();
//        System.out.println(cl);

//        Method[] methods = cl.getDeclaredMethods();
//        for (Method method : methods){
//            System.out.println(method.getName() + " ");
//        }
//        Constructor[] c = cl.getConstructors();
//        for (Constructor constructor : c){
//            Parameter[] parameter = constructor.getParameters();
//            System.out.println(constructor.getName() + " ");
//            for (Parameter parameter1 : parameter){
//                System.out.println(parameter1.getName() + parameter1.getType());
//            }
//        }
        Field[] fields = cl.getDeclaredFields();
        for (Field f : fields){
            System.out.println(f.getName() + f.getType());
            f.setAccessible(true);
            if (f.getName().equals("name")) {
                f.set(p, "Dana");
            }
            f.setAccessible(false);

        }
        System.out.println(p.getName());
    }
}

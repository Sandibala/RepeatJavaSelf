package module2Lec9object;

import java.util.ArrayList;

public class ABCmain {
    public static void main(String[] args) {
        Object o;
        A a = new A();
        B b = new B();
        C c = new C();

//        o = a;
//        o = b;
//        o = c;

        ArrayList<Object> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        System.out.println(list);
    }
}

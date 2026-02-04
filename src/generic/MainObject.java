package generic;

import java.lang.Object;

public class MainObject {
    public static void main(String[] args) {
//        BoxObject box = new BoxObject();
//        box.value = "Hello";
//        box.value = 123;          // ✔ компилируется
//        String s = (String) box.value; // 💥 ClassCastException

//        BoxGeneric<String> boxGeneric = new BoxGeneric<>();
//        boxGeneric.value = 123;
//        boxGeneric.value = "ghvbjnk";
        Box<String> box1 = new Box<>();
        box1.setValue("hell9");

        String s = box1.getValue();
        System.out.println(s);


    }
}

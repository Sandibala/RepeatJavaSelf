package m2Lev15;

public class Outer {
    void method(){
        int num = 5;

        class LocalInner{
            void show(){
                System.out.println("Num " + num );
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.show();
    }
}


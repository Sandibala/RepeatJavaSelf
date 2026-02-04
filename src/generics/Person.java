package generics;

public class Person <T>{
    T a;
    T b;
        public void show (T a, T b){
            System.out.println(a + " " + b);
        }
        public Person(){}

    public Person(T a, T b){
            this.a = a;
            this.b = b;
    }

    public T getA(){
            return a;
    }
    public T getB(){
            return b;
    }
}

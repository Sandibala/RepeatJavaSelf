package generics;

public class generics1 {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        show(a,b);
        Long c = 4L;
        Long d = 3L;
        show(c, d);

        String hi = "Hello";
        String w = "World!";
        show(hi, w);

        show(hi, a);

    }
    public static void show(Integer a, Integer b){
        System.out.println(a + " " + b);
    }
    public static void show(Long a, Long b){
        System.out.println(a + " " + b);
    }

    // так делать затратно и  для каждого типа приходится все заново писать метод show и поэтому придумали generics

    public static <T, U> void show(T a, U b){
        System.out.println(a + " " + b);
    }

}

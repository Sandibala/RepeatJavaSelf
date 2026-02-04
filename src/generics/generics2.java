package generics;
//Типизация в классах
public class generics2 {
    public static void main(String[] args) {
    Person<Integer> p = new Person<>();
    p.show(1, 3);
    Person<Long> p1 = new Person<>();
    p1.show(3L,4L);

    Person<Integer> person = new Person<>(3,5);
        System.out.println(person.getA());
        System.out.println(person.getB());
        person.show(2,5);
    }
}

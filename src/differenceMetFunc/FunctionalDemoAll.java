package differenceMetFunc;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalDemoAll {
    public static void main(String[] args) {

        //--------Создаёт объект (ничего не принимает)--------------//
        Supplier<Person> personSupplier = () -> new Person("Alice");
        Person p = personSupplier.get();
        System.out.println("Supplier gave me: " + p);

        //--------Преобразует объект в что-то (T → R)--------------//
        Function<Person, String> getShoutedName = person -> person.shoutName();
        String shoutedName = getShoutedName.apply(p);
        System.out.println("Function applied: " + shoutedName);

        //--------Что-то делает с объектом (принимает, ничего не возвращает)------------//
        Consumer<String> printMessage = msg -> System.out.println("Consumer says: " + msg);
        printMessage.accept(shoutedName);

        //--------Привязан к объекту, возвращает результат-------------//
        System.out.println("Direct method call: " + p.shoutName());
    }
}

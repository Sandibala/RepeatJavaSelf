package generic;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierConsumer {
    public static void main(String[] args) {

        // SUPPLIER — создаёт объект
        Supplier<Rectangle> supplier = Rectangle::new;

        // CONSUMER — принимает объект и обрабатывает
        Consumer<Rectangle> consumer =
                r -> System.out.println("Using rectangle: " + r);

        // Использование
        Rectangle rectangle = supplier.get();   // ← Supplier ДАЁТ
        consumer.accept(rectangle);             // ← Consumer ПРИНИМАЕТ
    }
}
//Supplier → создать
//Consumer → использовать
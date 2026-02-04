package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Аннотация будет доступна во время выполнения
@Retention(RetentionPolicy.RUNTIME)
// Можно ставить только на методы
@Target(ElementType.METHOD)
    public @interface Log {
        String value()
                default "Метод вызван";
    }


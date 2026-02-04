package annotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        // Берём все методы класса Service
        for (Method method : service.getClass().getDeclaredMethods()) {
            // Если метод помечен аннотацией @Log
            if (method.isAnnotationPresent(Log.class)) {
                Log log = method.getAnnotation(Log.class);
                System.out.println("[LOG] " + log.value());

                try {
                    // Вызов метода с параметром (для простоты передадим "Alex")
                    if (method.getParameterCount() == 1) {
                        method.invoke(service, "Alex");
                    } else {
                        method.invoke(service);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

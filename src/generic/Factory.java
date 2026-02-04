package generic;

public class Factory <T>{
        private final Class<T> type;

        Factory(Class<T> type) {
            this.type = type;
        }

        T create() throws Exception {
            return type.getDeclaredConstructor().newInstance();
        }
    }


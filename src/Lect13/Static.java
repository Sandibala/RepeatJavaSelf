package Lect13;
public class Static {
    static int count = 0;
}

class MathUtils {
    static int square(int x) {  // статический метод
        return x * x;
    }

    int multiply(int x, int y) { // обычный метод
        return x * y;
    }
}

class main{
    public static void main(String[] args) {
        System.out.println(Static.count);

        Static.count++;
        System.out.println(Static.count);

        // Вызов статического метода через класс
        System.out.println(MathUtils.square(5)); // 25

        // Вызов обычного метода через объект
        MathUtils m = new MathUtils();
        System.out.println(m.multiply(5, 2)); // 10
    }
}
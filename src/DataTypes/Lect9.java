package DataTypes;

public class Lect9 {
    int sum = 2;
    public void add (int data){
        int sum = data * 2;
        System.out.println(sum);
        this.sum = this.sum + 3;
    }
    public static void main(String[] args) {
//        Lect9 obj = new Lect9();     // создаём объект
//        System.out.println(obj.sum); // 2
//        obj.add(5);                  // вызываем метод add
//        System.out.println(obj.sum); // 5
//        }
        // \t — табуляция
        System.out.println("Hello\tWorld"); // Hello    World

        // \b — backspace (удаляет предыдущий символ)
        System.out.println("Hello\bWorld"); // HellWorld

        // \n — новая строка
        System.out.println("Line1\nLine2");
        // Line1
        // Line2

        // \r — возврат каретки (начало строки)
        System.out.println("12345\rABCDE"); // ABCDE

        // \f — прогон страницы (form feed, часто не видно в консоли)
        System.out.println("Hello\fWorld");

        // \' — одинарная кавычка
        System.out.println("It\'s Java"); // It's Java

        // \" — двойная кавычка
        System.out.println("Quote: \"Java\""); // Quote: "Java"

        // \\ — обратный слэш
        System.out.println("Backslash: \\"); // Backslash: \

        String s1 = new String("Hello"); // обычный объект в куче
        String s2 = s1.intern();         // добавляем/получаем ссылку из String Pool
        String s3 = "Hello";

        System.out.println(s2 == s2);


    }
}

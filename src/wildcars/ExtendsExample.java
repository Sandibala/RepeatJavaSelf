package wildcars;

import java.util.List;

public class ExtendsExample {
    public static void printNumbers(List<? extends Number> numbers) {
        for (Number n : numbers) {
            System.out.println(n);
        }
    }
}

// List<? extends Number> numbers
//Смысл
//Используем, когда получаем данные (producer).
//“Мне всё равно какой именно подкласс, я хочу просто читать”
// Удобно когда только читаешь готовые данные
// нельзя add метод использовать иначе ошибка
//Можно смотреть, но нельзя класть
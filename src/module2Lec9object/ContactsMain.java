package module2Lec9object;

import java.lang.reflect.Field;

public class ContactsMain {
    public static void main(String[] args)throws Exception {
        Contacts contacts = new Contacts(123, "Marat", "2345666");
        // Получаем все поля класса Contacts
        Field[] fields = contacts.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true); // чтобы получить значение private полей, если есть
            System.out.println(field.getName() + " = " + field.get(contacts));
        }
        String a = "Hello";
        String b = a.toUpperCase();
        System.out.println(a == b);
    }
}



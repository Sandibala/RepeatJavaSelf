package Lect1;

public class intTest {
    public static void main(String[] args) {

        // int
        int s = 200;
        int d = 200;
        System.out.println(s ==d );

      Integer a = Integer.valueOf(128);
      Integer b  = Integer.valueOf(128);
      Integer c = a + b ;
      System.out.printf("Solution is %s %n", c);

        String so = "Hello ";
        String d0= "Helleo";
        System.out.println(s + d);






//
//
//
//        //String Преобразование строки в число
//        String a = "123";
//        int x = Integer.parseInt(a);
//        int j = Integer.parseInt("12345"+4);
//        System.out.println(j);
//        System.out.println(x + 1);
//
//
//        //Перевод объекта/примитива в строку
//        double d = 1234.657;
//        boolean b = false;
//        System.out.println("Возвращаемое значение: " + String.valueOf(d));
//        System.out.println("Возвращаемое значение: " + String.valueOf(b));
//
//        //Методы работы со строками
//        String name = "Sandu";
//        int count = name.length();
//        String name2 = name.toLowerCase();
//        String name3 = name.toUpperCase();
//        System.out.println(count);
//        System.out.println(name2);
//        System.out.println(name3);
//
//        //
//        String prl = "123";
//        prl ="456";
//        System.out.println(prl);
//
//        //
//        String s1 = "Кот";
//        String s2 = new String("Кот");
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//
//        int age = 70;
//
//        boolean isSenior = (age > 65); if (isSenior)
//            System.out.println("Пора на пенсию");
    }
}

package Lect12;

public class Lect12 {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla",2019); // создаём объект и сразу задаём его поля
        System.out.println(car1.name);   // Tesla
        System.out.println(car1.year);// 250

         String name = "Alice";
         String name1 = "Alise";
        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = arr1;

        System.out.println(arr1.hashCode()); // число объекта arr1
        System.out.println(arr2.hashCode()); // число объекта arr2, другое
        System.out.println(arr3.hashCode()); // совпадает с arr1
    }

        //Что происходит:
        //
        //Создали объект car1
        //
        //Конструктор автоматически присвоил значения полям model и maxSpeed
        //
        //Теперь объект готов к использованию
        //Конструктор = способ сразу заполнить объект данными,
        // чтобы потом можно было с ним работать.
    }


class Car{
    String name;
    int year;

    public Car(String name, int year){
        this.name = name;  // присваиваем полю name значение из параметра
        this.year = year;  // присваиваем полю year значение из параметра
    }

}
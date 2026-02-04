package generics;

import Lect15.Array;

import java.util.ArrayList;
//Дженерики. Пример с ArrayList
// Дженерики. Типизация используя extends

public class generics3 {
    public static void main(String[] args) {

        //----------------------------------//
//        ArrayList list = new ArrayList();
//        list.add(1);
//        list.add(3.4);
//        list.add("String");
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//
//            //without generics
//        }
        //----------------------------------//
        Cat cat = new Cat();
        show(cat);

        Animal animal = new Animal();
        show(animal);
    }
    public static <T extends Animal> void show(T a){

    }
}

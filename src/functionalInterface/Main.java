package functionalInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyFunction f = name -> System.out.println("My name is " + name);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        f.myName(name);

    }
}

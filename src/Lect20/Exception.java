package Lect20;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int a = in.nextInt();
            int b = in.nextInt();

            try {
                int divide = divide(a, b);
                System.out.println("a / b = " + divide);
            } catch (ArithmeticException e) {
                System.out.println("Impossinle divide to 0");
            }
        }
    }

    public static int divide(int a, int b) throws ArithmeticException{
      if(b == 0) throw new ArithmeticException();
       return  a / b;
    }
}

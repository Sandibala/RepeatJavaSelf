package Lect15;

public class Inte {
    public static void main(String[] args) {
        int num = 42;

        String bin = Integer.toBinaryString(num);   // "101010"
        String hex = Integer.toHexString(num);      // "2a"
        String oct = Integer.toOctalString(num);    // "52"

        Integer obj = Integer.valueOf(num);         // int → Integer
        int n = Integer.parseInt("123");            // String → int

        double x = 12.5;

        String hex1 = Double.toHexString(x);       // "0x1.9p3"
        boolean inf = Double.isInfinite(x);       // false
        boolean nan = Double.isNaN(x);            // false

        Double obj1 = Double.valueOf(x);           // double → Double
        double y = Double.parseDouble("3.14");   // String → double

        char c = 'A';

        boolean letter = Character.isLetter(c);       // true
        boolean digit = Character.isDigit(c);         // false
        char lower = Character.toLowerCase(c);        // 'a'
        char upper = Character.toUpperCase('b');      // 'B'

        Boolean flag1 = Boolean.TRUE;   // true
        Boolean flag2 = Boolean.FALSE;  // false
        boolean b = flag1;              // unboxing, flag1 → true


    }
}

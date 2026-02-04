package lyambdaFuncInterface;

public class LyambdaFuncInt {
    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation() {
            @Override
            public void operate(int x, int y) {
                System.out.println("It works! " + x +" " + y );
            }
        };
        mathOperation.operate(10, 20);

        MathOperation mathOperation1 = (x, y ) -> {
            System.out.println("It works with Lyambda Too!");
            System.out.println( x + " " + y);
        };
        mathOperation1.operate(11, 22);
    }
}

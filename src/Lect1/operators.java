package Lect1;

public class operators {
    public static void main(String[] args) {
        //Ternar operator
       int age = 14;
       String status= age > 10 ? "Teen" : "Not Teen";
        System.out.println(status);

        String text = "Hiii";
        String message = text;
        System.out.println(text == message);
        System.out.println(text.equals(message));

        int n = 0;
        while (n < 5) {

            int m = 0;

            while (m < 5) { System.out.print("А");
                m++;
            }
            System.out.println(); n++;

        }



    }
}

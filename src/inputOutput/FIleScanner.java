package inputOutput;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Java урок - 15.1.2 Ввод-вывод. Классы File и Scanner
public class FIleScanner {
    public static void main(String[] args) throws IOException {
        File file = new File("out.txt");
        Scanner in = new Scanner(file);
        while (in.hasNext()){
            String str = in.next();
            System.out.println(str);
        }

    }
}

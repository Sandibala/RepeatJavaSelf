package inputOutput;
//Java урок - 15.1.1 Ввод-вывод. Классы File и PrintWriter
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("out.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("Hello");
        printWriter.println("World!");
        printWriter.close();
    }
}

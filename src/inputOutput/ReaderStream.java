package inputOutput;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReaderStream {
    public static void main(String[] args) throws IOException {
        File file = new File("out.txt");
        PrintWriter out = new PrintWriter(file);
        FileReader in = new FileReader(file);
        out.println("Hello");
        out.println(125);
        out.close();

        int temp;
        while ((temp = in.read())!= -1){
            System.out.print((char) temp);
        }
        in.close();

    }
}

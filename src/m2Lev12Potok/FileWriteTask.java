package m2Lev12Potok;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTask implements Runnable{
    @Override
    public void run() {
        try (FileWriter writer = new FileWriter("out.txt")) {
            writer.write("Запись из отдельного потока\n");
            System.out.println("Записал данные в файл");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

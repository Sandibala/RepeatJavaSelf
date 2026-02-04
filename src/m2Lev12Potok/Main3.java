package m2Lev12Potok;

import java.io.FileWriter;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        Thread counterThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Считаю: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    return;
                }
            }
        });

        Thread waitingThread = new Thread(() -> {
            System.out.println("Жду данные...");
            try {
                Thread.sleep(3000);
                System.out.println("Данные получены!");
            } catch (InterruptedException e) {
                return;
            }
        });

        Thread fileThread = new Thread(() -> {
            try (FileWriter writer = new FileWriter("output.txt")) {
                writer.write("Запись в файл из потока\n");
                System.out.println("Записал данные в файл");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        counterThread.start();
        waitingThread.start();
        fileThread.start();
    }
}

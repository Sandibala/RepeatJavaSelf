package socket;

import java.net.*;

public class UDPServer1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(5001); // порт 5001
        byte[] buffer = new byte[1024];

        System.out.println("UDP сервер запущен...");
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet); // ждём пакет от клиента

        String message = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Клиент пишет: " + message);

        String response = "Привет от UDP сервера!";
        DatagramPacket responsePacket = new DatagramPacket(
                response.getBytes(),
                response.length(),
                packet.getAddress(),
                packet.getPort()
        );
        socket.send(responsePacket); // отправляем ответ
        socket.close();
    }
}

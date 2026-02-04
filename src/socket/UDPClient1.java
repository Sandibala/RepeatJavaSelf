package socket;

import java.net.*;

public class UDPClient1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        String message = "Привет, UDP сервер!";
        byte[] buffer = message.getBytes();

        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 5001);
        socket.send(packet); // отправляем пакет

        byte[] responseBuffer = new byte[1024];
        DatagramPacket responsePacket = new DatagramPacket(responseBuffer, responseBuffer.length);
        socket.receive(responsePacket); // ждём ответ

        String response = new String(responsePacket.getData(), 0, responsePacket.getLength());
        System.out.println("Сервер ответил: " + response);

        socket.close();
    }
}

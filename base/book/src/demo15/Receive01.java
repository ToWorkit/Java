package demo15;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * 2. 接收Receive
 * 创建DatagramSocket, 指定端口号
 * 创建DatagramPacket, 指定数组，长度
 * 使用DatagramSocket 接收 DatagramPacket
 * 关闭DatagramSocket
 * 从DatagramPacket中获取数据
 */

public class Receive01 {
	public static void main(String[] args) throws Exception {
		// 创建Socket相当于创建码头
		DatagramSocket socket = new DatagramSocket(6060);
		// 创建Packet相当于创建集装箱
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
		// 接收货物(数据)
		socket.receive(packet);
		// 获取数据
		byte[] arr = packet.getData();
		// 获取有效的字节个数
		int len = packet.getLength();
		// 转为String
		System.out.println(new String(arr, 0, len));
		socket.close();
	}
}

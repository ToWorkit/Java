package demo15;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 发送Send
 * 创建DatagramSocket, 随机端口号
 * 创建DatagramPacket, 指定数据，长度，地址，端口
 * 使用DatagramSocket发送DatagramPacket
 * 关闭DatagramSocket
 */

public class Send01 {
	public static void main(String[] args) throws Exception {
		String str = "Hello Word";
		// 创建Socket相当于创建码头
		DatagramSocket socket = new DatagramSocket();
		// 创建Packet相当于集装箱
		DatagramPacket packet = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), 6060);
		
		// 发货，将数据发出去
		socket.send(packet);
		// 关闭
		socket.close();
	}
}

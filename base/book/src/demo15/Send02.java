package demo15;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*
 * 1 发送 Send
 * 创建DatagramSocket, 随机端口号
 * 创建DatagramPacket, 指定数据，长度，地址，端口
 * 使用DatagramSocket 发送 DatagramPacket
 * 关闭DatagramSocket
 */

public class Send02 {
	public static void main(String[] args) throws Exception {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		// 创建Socket相当于创建码头
		DatagramSocket socket = new DatagramSocket();
		
		while(true) {
			String line = sc.nextLine();
			if ("q".equals(line)) {
				break;
			}
			// 创建Packet相当于集装箱存储数据
			DatagramPacket packet = new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("127.0.0.1"), 9090);
			// 发货，将数据发送出去
			socket.send(packet);
		}
		
		// 关闭连接
		socket.close();
	}
}

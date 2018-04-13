package demo15;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * 2 接收Receive
 * 创建DatagramSocket，指定端口号
 * 创建DatagramPacket，指定数组，长度
 * 使用DatagramSocket 接收 DatagramPacket
 * 关闭DatagramSocket
 * 从DatagramPacket中获取数据
 */

public class Receive02 {
	public static void main(String[] args) throws Exception {
		// 创建Socket -> 码头
		DatagramSocket socket = new DatagramSocket(9090);
		// 创建Packet -> 集装箱
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
		
		while(true) {
			// 接收数据(send发来的数据货物)
			socket.receive(packet);
			// 获取数据
			byte[] arr = packet.getData();
			// 获取有效的字节个数
			int len = packet.getLength();
			// 获取ip地址
			String ip = packet.getAddress().getHostAddress();
			// 获取端口号
			int port = packet.getPort();
			// 获取端口号
			System.out.println(ip + ":" + port + ":" + new String(arr, 0, len));
		}
	}
}

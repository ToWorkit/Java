package demo15;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * ����Send
 * ����DatagramSocket, ����˿ں�
 * ����DatagramPacket, ָ�����ݣ����ȣ���ַ���˿�
 * ʹ��DatagramSocket����DatagramPacket
 * �ر�DatagramSocket
 */

public class Send01 {
	public static void main(String[] args) throws Exception {
		String str = "Hello Word";
		// ����Socket�൱�ڴ�����ͷ
		DatagramSocket socket = new DatagramSocket();
		// ����Packet�൱�ڼ�װ��
		DatagramPacket packet = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), 6060);
		
		// �����������ݷ���ȥ
		socket.send(packet);
		// �ر�
		socket.close();
	}
}

package demo15;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * 2 ����Receive
 * ����DatagramSocket��ָ���˿ں�
 * ����DatagramPacket��ָ�����飬����
 * ʹ��DatagramSocket ���� DatagramPacket
 * �ر�DatagramSocket
 * ��DatagramPacket�л�ȡ����
 */

public class Receive02 {
	public static void main(String[] args) throws Exception {
		// ����Socket -> ��ͷ
		DatagramSocket socket = new DatagramSocket(9090);
		// ����Packet -> ��װ��
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
		
		while(true) {
			// ��������(send���������ݻ���)
			socket.receive(packet);
			// ��ȡ����
			byte[] arr = packet.getData();
			// ��ȡ��Ч���ֽڸ���
			int len = packet.getLength();
			// ��ȡip��ַ
			String ip = packet.getAddress().getHostAddress();
			// ��ȡ�˿ں�
			int port = packet.getPort();
			// ��ȡ�˿ں�
			System.out.println(ip + ":" + port + ":" + new String(arr, 0, len));
		}
	}
}

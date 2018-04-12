package demo15;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * 2. ����Receive
 * ����DatagramSocket, ָ���˿ں�
 * ����DatagramPacket, ָ�����飬����
 * ʹ��DatagramSocket ���� DatagramPacket
 * �ر�DatagramSocket
 * ��DatagramPacket�л�ȡ����
 */

public class Receive01 {
	public static void main(String[] args) throws Exception {
		// ����Socket�൱�ڴ�����ͷ
		DatagramSocket socket = new DatagramSocket(6060);
		// ����Packet�൱�ڴ�����װ��
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
		// ���ջ���(����)
		socket.receive(packet);
		// ��ȡ����
		byte[] arr = packet.getData();
		// ��ȡ��Ч���ֽڸ���
		int len = packet.getLength();
		// תΪString
		System.out.println(new String(arr, 0, len));
		socket.close();
	}
}

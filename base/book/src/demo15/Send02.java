package demo15;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*
 * 1 ���� Send
 * ����DatagramSocket, ����˿ں�
 * ����DatagramPacket, ָ�����ݣ����ȣ���ַ���˿�
 * ʹ��DatagramSocket ���� DatagramPacket
 * �ر�DatagramSocket
 */

public class Send02 {
	public static void main(String[] args) throws Exception {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		// ����Socket�൱�ڴ�����ͷ
		DatagramSocket socket = new DatagramSocket();
		
		while(true) {
			String line = sc.nextLine();
			if ("q".equals(line)) {
				break;
			}
			// ����Packet�൱�ڼ�װ��洢����
			DatagramPacket packet = new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("127.0.0.1"), 9090);
			// �����������ݷ��ͳ�ȥ
			socket.send(packet);
		}
		
		// �ر�����
		socket.close();
	}
}

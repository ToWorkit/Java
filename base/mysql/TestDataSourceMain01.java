package com.proxy.mysql;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDataSourceMain01 {
	public static void main(String[] args) throws SQLException {
		// ����һ�����ӳ�
		DataSourcePool01 pool = new DataSourcePool01();
		
		// ȡ������ʹ��
		for (int i = 0; i < 11; i++) {
			// ���÷���
			Connection conn = pool.getConnection();
			
			System.out.println("��" + i + "����" + conn);
			
			// �ر� -> ���õ��������Ķ���
			// �Ѹ����ӻ������ݿ���������ӳ�(��Ϊ�Ѿ�û�������������׳��쳣)
			conn.close(); // ʹ�ö�̬������д��close����
		}
	}
}

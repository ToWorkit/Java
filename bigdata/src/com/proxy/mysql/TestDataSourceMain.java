package com.proxy.mysql;

import java.sql.Connection;

public class TestDataSourceMain {

	public static void main(String[] args) throws Exception {
		//����һ�����ӳ�
		DataSourcePool pool = new DataSourcePool();
		
		//ȡ������ʹ��
		for(int i=0;i<11;i++){
			Connection conn = pool.getConnection();
			
			// �޸ĺ��ȡ�����Ǵ������
			System.out.println("��"+i + "����"+ conn);
			
			//�ر�
			conn.close(); //----> ���õ�����������Connection.close����  �Ѹ����ӻ������ݿ⣬�����ǻ������ӳ�
		}

	}

}

package com.itstar.demo04;
/*
 * �������ǵ�ע�����
 * 	���෽�����Ǹ��෽�������뱣֤Ȩ��Ҫ���ڵ��ڸ����Ȩ��
 * 	������д����ķ�������֤�����Ȩ��Ҫ���ڵ��ڸ����Ȩ��
 * java����4��Ȩ�ޣ����μ�С
 * 	public:����
 *  protected:�ܱ�����
 *  default:Ĭ��(�ر𣬲�д)
 *  private:˽�е�
 */
public class AndroidPhone extends Phone{
	public void weChat() {
		super.weChat();
		System.out.println("��һ��");
		System.out.println("��ǿ����");
	}
}

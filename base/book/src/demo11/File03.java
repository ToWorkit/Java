package demo11;

import java.io.File;

/**
 *  * A:��������ɾ������
		* public boolean renameTo(File dest):���ļ�������Ϊָ�����ļ�·��
		* public boolean delete():ɾ���ļ������ļ���
	* B:������ע������
		* ���·������ͬ�����Ǹ�����
		* ���·������ͬ�����Ǹ��������С�
	* C:ɾ��ע�����
		* Java�е�ɾ�����߻���վ��
		* Ҫɾ��һ���ļ��У���ע����ļ����ڲ��ܰ����ļ������ļ���
	* d:�жϹ���
		* public boolean isDirectory():�ж��Ƿ���Ŀ¼
		* public boolean isFile():�ж��Ƿ����ļ�
		* public boolean exists():�ж��Ƿ����
		* public boolean canRead():�ж��Ƿ�ɶ�
		* public boolean canWrite():�ж��Ƿ��д
		* public boolean isHidden():�ж��Ƿ�����
 */

public class File03 {
	public static void main(String[] args) {
/*		// ֱ��ɾ�������߻���վ
		File file01 = new File("F:\\a\\c.txt");
		System.out.println(file01.delete());
		
		File file02 = new File("F:\\aaa");
		// ɾ���ļ��б����ǿյ�
		System.out.println(file02.delete());*/
//		demo01();
		demo02();
	}
	
	public static void demo01() {
		File file01 = new File("F:\\a\\d.txt");
		File file02 = new File("F:\\a\\ddd.txt");
		
		System.out.println(file01.renameTo(file02));
	}
	
	public static void demo02() {
		File dir03 = new File("F:\\a");
		System.out.println(dir03.isDirectory());
	}
}

package demo12;

/**
 * * A:������1
		* final,finally��finalize������
		* final����������,���ܱ��̳�
		* ���η���,���ܱ���д
		* ���α���,ֻ�ܸ�ֵһ��
		* 
		* finally��try����е�һ�������,���ܵ���ʹ��,�����ͷ���Դ
		* 
		* finalize��һ������,������������ȷ�������ڶԸö���ĸ�������ʱ���ɶ�����������������ô˷�����
	* B:������2
		* ���catch������return��䣬����finally�Ĵ��뻹��ִ����?����ᣬ��������returnǰ����return��
 */

public class test01 {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.method());
	}
}
class Demo {
	public int method() {
		int x = 10;
		try {
			x = 20;
			System.out.println(1/0);
			return x;
		} catch (Exception e) {
			x = 30;
			return x;
		} finally {
			x = 40;
			// ��Ȼ��ִ�У�ֵΪ 40
//			return x; 
		}
	}
}

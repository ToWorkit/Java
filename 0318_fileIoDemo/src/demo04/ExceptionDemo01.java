package demo04;

/*
 * �쳣�Ĺؼ��֣�
 * 	 throw���ڷ������ڲ��׳��쳣�Ķ���
 *   throw �������new ���󣬺����׳��쳣����������쳣����п�����
 *   
 *   �����������ؼ���throws -> ���ڷ����������ϣ������˷�������������, ������ߴ���
 *   
 */
public class ExceptionDemo01 {
	public static void main(String[] args) throws Exception {
		int[] arr = null;
		int i = getArray(arr);
		System.out.println(i);
	}
	
	public static int getArray(int[] arr) throws Exception {
		if (arr == null) {
			// �׳��쳣
			throw new Exception("���ݵ����鲻����");
		} else if (arr.length == 0) {
			// �׳�
			throw new Exception("���鲻��Ϊ��");
		}
		int i = arr[arr.length - 1];
		return i *2;
	}
}

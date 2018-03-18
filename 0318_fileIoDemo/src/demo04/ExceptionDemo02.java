package demo04;

/*
 * �쳣�Ĵ���ʽ��
 * 	��ʽ��
 * 		try...catch...finally
 * 
 * 		try{
 * 			�����Ĵ���
 * 			���ܳ����쳣�Ĵ���
 * 		}catch( �쳣����  ������){
 * 			�쳣�Ĵ���ʽ
 * 			
 * 		}finally{
 * 			����Ҫִ�еĴ���
 * 		}
 * 
 *
 */

public class ExceptionDemo02 {
	public static void main(String[] args) {
		int[] arr = {};
		/*
		 * �����쳣
		 */
		try {
			int i = getArray(arr);
			System.out.println(i);
		} catch(NullPointerException e) {
			System.out.println(e);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			// ���쳣��Ϣ����ϸ���� �����׳��쳣����������Ϣ��ӡ����  -> �������쳣
			System.out.println(e.getMessage());
			// ���쳣��Ϣ�ļ������� ->java.lang.Exception: �������쳣 -> Ĭ��
			System.out.println(e.toString());
			// ���쳣��Ϣ׷�ٵ���׼�Ĵ����� �б���ľ���λ��
			e.printStackTrace();
		} finally {
			System.out.println("�������");
		}
	}
	
	public static int getArray(int[] arr) {
		if (arr == null) {
			// �ֶ��׳�
			throw new NullPointerException("���鲻����(��ָ���쳣)");
		}
		if (arr.length < 4) {
			throw new ArrayIndexOutOfBoundsException("������û��4����(����Խ���쳣)");
		}
		return arr[4] + 1;
	}
}

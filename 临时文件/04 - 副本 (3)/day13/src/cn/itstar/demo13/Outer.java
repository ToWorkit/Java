package cn.itstar.demo13;
/*
 * ��һ���ඨ���ڷ�����
 */
public class Outer {
	public void out(){
		class inner{
			public void inner() {
				System.out.println("�ֲ��ڲ���ķ���");
			}
		}
		/*����������ܵ��� ��������������������
		 * inner in = new inner();
		in.inner();*/
	}
	
	public void out2() {
		//�಻���� ���ڲ�ͬ�ķ���
		class inner{
			
		}
	}
}

public class TestPhone{
	/*
		���ԣ�
			1�������->�����������ͬһ���ļ��е��оͲ���Ҫ������
			2�����������������ͱ���
			3������.�����еĹ���
	*/
	public static void main(String[] args){
		//2�����������������ͱ���
		Phone p = new Phone();
		//System.out.println(p);
		
		//3������.�����еĹ���
		//System.out.println(p.color);
		p.color = "��ɫ";
		p.brand = "ƻ��x";
		p.size = 5.1;
		
		//��ȡ����ֵ
		System.out.println(p.color + "     " + p.brand + "     " + p.size);
	}
}
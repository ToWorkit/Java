public class ASCIIDemo{
	/*
		charת��Ϊint���͵�ʱ�������Զ�����,char�������ͣ���ȥ��ѯ������õ�����
	*/
	public static void main(String[] args){
		char c = 'a';
		int i = c + 1;
		System.out.println(i);//98
		
		int j = 90;
		//ǿ������ת��
		char h = (char)j;
		System.out.println(h);//Z
		
		System.out.println((char)6);
		
		char k = '��';
		System.out.println(k);
		
		//char���͵ķ�Χ0-65535
		char n = 70000;
	}
}
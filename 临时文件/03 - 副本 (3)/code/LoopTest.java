public class LoopTest{
	public static void main(String[] args){
		/*
			������е�Ӣ����ĸ
				1Сд
				2��д
				52
			���ñ������ʵ��
			A-Z     65-90
			a-z     97-122
			
			˼·��
				1.�������������Сдa�������дA
				2.ѭ��26�Σ��������õı���
				ÿ��ѭ��������++
		*/
		//������� ������ĸ
		char xiaoxie = 'a';
		char daxie = 'A';
		
		//ѭ��
		for(int i = 0; i < 26;i++){
			System.out.println(xiaoxie + "  "+daxie);
			
			daxie++;
			xiaoxie++;
		}
	}
}
/*
	��������ࣺ
		ͬʱ���ԣ��緹��������
*/
public class Test{
	public static void main(String[] args){
		//�����緹������������
		DianFanGuo dfg = new DianFanGuo();
		
		dfg.brand = "����";
		dfg.size = 13.4;
		dfg.color = "��ɫ";
		
		//����������
		Car c = new Car();
		
		c.brand = "����";
		c.pailiang = 0.5;
		c.type = "�ܳ�";
		
		System.out.println(dfg.brand + "  " + dfg.size + "    "+ dfg.color);
		System.out.println(c.brand + "  " + c.pailiang + "    "+ c.type);
	}
}
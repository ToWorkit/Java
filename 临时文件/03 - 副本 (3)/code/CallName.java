import java.util.Random;
import java.util.ArrayList;
public class CallName{
	/*
		��������Ķ�����������ü������Ż�
		String[] s = {"",""}
	*/
	public static void main(String[] args){
		//���弯�� �洢ѧ������
		ArrayList<StudentName> array = new ArrayList<StudentName>();
		//������ӷ���
		add(array);
		//���ñ������Ϸ��� ʵ��Ԥ��
		printArrayList(array);
		
		System.out.println("====================");
		//���������
		randomStudentName(array);
	}
	//�����������Random
	public static void randomStudentName(ArrayList<StudentName> array){
		Random r = new Random();
		//�õ������
		int number = r.nextInt(array.size());
		//��Ϊ���� �����ϵ��в���
		StudentName s = array.get(number);
		System.out.println(s.name + "  " + s.age);
	}
	
	//����ѧ������Ϣ����������
	public static void printArrayList(ArrayList<StudentName> array){
		for(int i = 0;i < array.size();i++){
			StudentName s = array.get(i);
			System.out.println(s.name+ "   " +s.age );
		}
	}
	
	//�򼯺��м���ѧ����Ϣ
	public static void add(ArrayList<StudentName> array){
		//����StudentName�����ͱ���
		StudentName sn1 = new StudentName();
		StudentName sn2 = new StudentName();
		StudentName sn3 = new StudentName();
		StudentName sn4 = new StudentName();
		
		sn1.name = "�����Ȱ�";
		sn1.age = 18;
		
		sn2.name = "����";
		sn2.age = 20;
		
		sn3.name = "����";
		sn3.age = 24;
		
		sn4.name = "����";
		sn4.age = 33;
		
		array.add(sn1);
		array.add(sn2);
		array.add(sn3);
		array.add(sn4);
	}
	
}
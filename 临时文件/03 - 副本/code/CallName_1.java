import java.util.Random;
public class CallName_1{
	public static void main(String[] args){
		//�������� �洢ѧ������->����
		String[] names = new String[5];
		//���ѧ��
		addStudent(names);
		//Ԥ��ѧ��
		printStudentName(names);
		
		System.out.println("=======================");
		
		//�������
		String xingming = randomStudentName(names);
		System.out.println(xingming);
		
	}
	/*
		���巽�������������Ϊ���������������ҵ�ѧ������
		����ֵ?ѧ��
		����?����
	*/
	public static String randomStudentName(String[] names){
		//���������
		Random rc = new Random();
		//������
		int index = rc.nextInt(names.length);
		//����ֵ
		return names[index];
	}
	
	/*
		���巽��ʵ��Ԥ��
		����ֵ?��
		����?����
	*/
	public static void printStudentName(String[] names){
		for(int i = 0;i < names.length;i++){
			System.out.println(names[i]);
		}
	}
	
	/*
		�����鵱�����ѧ������
		����ֵ?��
		������������������
	*/
	public static void addStudent(String[] names){
		names[0] = "����";
		names[1] = "����";
		names[2] = "����";
		names[3] = "����";
		names[4] = "hunter";
		
	}
	
}
// ���뼯�ϰ�
import java.util.ArrayList;
// �����������
import java.util.Random;
public class StudentArrayList {
	public static void main(String[] args) {
		// ����Ϊ����, ���弯�� �洢ѧ������
		// ��ͬһ�ļ����²���Ҫ����
		ArrayList<StudentName> arr_stu = new ArrayList<StudentName>();
		
		/* ���÷��� */
		// ���
		addStu(arr_stu);
		// չʾ
		showStu(arr_stu);
		// ���
		ranomStu(arr_stu);
	}
	// ���, ����Ҫ����ֵ, ���� ArrayList<StudentName> ��ʽ�Ĳ���
	public static void addStu(ArrayList<StudentName> array_stu) {
		// ��Ӷ��ѧ��, ��ʽΪ �Զ������
		StudentName s1 = new StudentName();
		StudentName s2 = new StudentName();
		StudentName s3 = new StudentName();
		StudentName s4 = new StudentName();
		
		s1.name = "����";
		s1.age = 10;
		
		s2.name = "����";
		s2.age = 21;
		
		s3.name = "�õ�";
		s3.age = 24;
		
		s4.name = "��";
		s4.age = 25;
		
		// ��ӵ����ϵ���
		array_stu.add(s1);
		array_stu.add(s2);
		array_stu.add(s3);
		array_stu.add(s4);
	}
	// չʾ
	public static void showStu(ArrayList<StudentName> array_stu) {
		for (int i = 0; i < array_stu.size(); i++) {
			System.out.println(array_stu.get(i).name + " " + array_stu.get(i).age);
		}
	}
	// ���ѡȡ
	public static void ranomStu(ArrayList<StudentName> array_stu) {
		// ���
		Random i = new Random();
		// int���͵������, ����Ϊ���ϵĳ��� 0 ~ array_stu.size() - 1
		int rom = i.nextInt(array_stu.size());
		
		/*
		StudentName s = array_stu.get(rom);
		s.name
		s.age
		*/
		
		// ���ѡȡ
		System.out.println(array_stu.get(rom).name + " " + array_stu.get(rom).age);
	}
}
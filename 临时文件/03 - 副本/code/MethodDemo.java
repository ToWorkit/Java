public class MethodDemo{
	public static void main(String[] args){
		//���÷���Random Scanner
		int area = getArea(3,4);
		System.out.println("���Ϊ��"+ area);
	}
	
	//��һ�������ε����
	
	public static int getArea(int w,int h){
		int area = w*h;
		return area;
	}
}
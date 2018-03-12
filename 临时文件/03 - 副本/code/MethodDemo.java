public class MethodDemo{
	public static void main(String[] args){
		//调用方法Random Scanner
		int area = getArea(3,4);
		System.out.println("面积为："+ area);
	}
	
	//求一个长方形的面积
	
	public static int getArea(int w,int h){
		int area = w*h;
		return area;
	}
}
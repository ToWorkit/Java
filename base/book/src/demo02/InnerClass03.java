package demo02;

public class InnerClass03 {
	public static void main(String[] args) {
		Outer_03.Inner oi = new Outer_03().new Inner();
		oi.show();
	}
}

class Outer_03 {
	public int num = 10;
	class Inner {
		public int num = 20;
		public void show() {
			int num = 30;
			System.out.println(num); // 30
			System.out.println(this.num); // 20
			System.out.println(Outer_03.this.num); // 10
			System.out.println(new Outer_03().num); // 10
		}
	}
}
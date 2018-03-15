package cn.itstar.demo12;

public class Outer {
	int a = 1;
	class Inner{
		int a = 2;
		public void inner() {
			int a = 3;
			//就近原则 如果想访问2怎么办？加个this.  如果想访问1怎么办？Outer.this.a
			System.out.println(a);
		}
		
	}
}

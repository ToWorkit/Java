package demo13;

import java.util.concurrent.Callable;

public class GetSumCallable01 implements Callable<Integer>{
	private int a;
	// �вι��췽��
	public GetSumCallable01(int a) {
		this.a = a;
	}
	
	// ��д�ӿڷ���
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 0; i <= a; i++) {
			sum += i;
		}
		return sum;
	}
}

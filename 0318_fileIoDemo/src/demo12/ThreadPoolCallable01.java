package demo12;

import java.util.concurrent.Callable;

// 接口实现类
public class ThreadPoolCallable01 implements Callable<String>{
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "A";
	}
}

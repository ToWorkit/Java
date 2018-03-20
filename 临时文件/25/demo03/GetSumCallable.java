package com.itstar.demo03;

import java.util.concurrent.Callable;

public class GetSumCallable implements Callable<Integer>{
	
	private int a;
	public GetSumCallable(int a) {
		this.a = a;
	}
	
	//重写的接口不能改 不能自己添加参数
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for(int i=1;i<=a;i++) {
			sum = sum+i;
		}
		
		
		return sum;
	}

}

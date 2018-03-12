package com.itstar.demo08;

public class Net extends YunWei{
	public Net(String name,String id ) {
		super(name,id);
	}

	@Override
	public void work() {
		System.out.println(super.getId()+"..."+super.getName()+"...正在维护中");
	}
	
	
}

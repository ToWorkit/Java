1：多线程->线程池

	JDK1.5新特性
	其实就是容纳多个线程的容器。其中的线程可以反复使用。
	无序我们反复创建线程而消耗过多的资源。
	
	线程池都是通过线程池工厂来创建的。
	再调用线程池中的方法来获取线程，再通过线程去执行任务。
	
2：多线程->第三种方式，实现了Callable接口


3：多线程->线程安全

	买票的方式 ？12306 携程 飞猪 ........
	票是有限的，购买方式不同
	
	多线程旺旺操作的是同一数据，可能出现问题
	
	
	解决安全问题：同步代码块、同步方法、锁
	
	
	锁：JDK1.5新特性 Lock接口
	效果一样，灵活性高
	
	出现死锁
	
	
4：多线程->线程的等待和唤醒
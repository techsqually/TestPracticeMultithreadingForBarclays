package com.techsquelly.pracitce.task;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class Task1 implements Callable<AtomicInteger> {
	
	AtomicInteger atomicint= new AtomicInteger(0);

	@Override
	public AtomicInteger call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("value of atomic int is "+Thread.currentThread().getName()+"--"+atomicint);
		return atomicint;
	}
	
	

}

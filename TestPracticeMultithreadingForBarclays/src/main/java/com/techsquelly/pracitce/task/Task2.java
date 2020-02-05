package com.techsquelly.pracitce.task;

public class Task2 implements Runnable {

	@Override
	public void run() {
		
			System.out.println("i am in runnable method"+Thread.currentThread().getName());
		
	}

}

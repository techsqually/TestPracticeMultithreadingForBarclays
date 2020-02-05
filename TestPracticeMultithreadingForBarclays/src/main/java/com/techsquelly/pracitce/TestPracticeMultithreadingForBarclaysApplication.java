package com.techsquelly.pracitce;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techsquelly.pracitce.task.Task1;
import com.techsquelly.pracitce.task.Task2;

@SpringBootApplication
public class TestPracticeMultithreadingForBarclaysApplication {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 100; i++) {
			Future<AtomicInteger> futint = service.submit(new Task1());
			try {
				System.out.println("i am in main with Callable"+Thread.currentThread().getName()+futint.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < 100; i++) {
			Thread task1 = new Thread(new Task2());
			service.execute(task1);
		}

	}

}

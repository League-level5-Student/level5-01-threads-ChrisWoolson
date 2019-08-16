package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
Thread[] threads;
ConcurrentLinkedQueue <Task> taskQueue;


ThreadPool(int totalT){
	threads = new Thread[totalT];
	for (int i = 0; i < threads.length; i++) {
		System.out.println(threads.length);
		threads[i] = new Thread(()->new Worker(taskQueue).run());
		
		//threads[i].run();
	}
	
	taskQueue = new ConcurrentLinkedQueue <Task>();
	
}

void addTask(Task task){
	taskQueue.add(task);
}

void start() {
	
	
	for (int i = 0; i < threads.length; i++) {
		threads[i].start();
		
		
		
		
	}
	for (int i = 0; i < threads.length; i++) {
		try {
			threads[i].join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}



}

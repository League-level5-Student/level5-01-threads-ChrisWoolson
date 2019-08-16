package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {

	
	
	ConcurrentLinkedQueue<Task> taskQueue;
	
	Worker(ConcurrentLinkedQueue<Task> taskQueue){
		//taskQueue = new ConcurrentLinkedQueue<Task>();
		this.taskQueue = taskQueue;
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(!taskQueue.isEmpty()) {
			Task taskR = taskQueue.remove();
			taskR.perform();
		}
		
		
		
	}


}

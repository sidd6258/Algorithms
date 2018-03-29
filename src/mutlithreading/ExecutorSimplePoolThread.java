package mutlithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{
	int i;
	
	public WorkerThread(int i) {
		this.i=i;
	}

	@Override
	public void run() {
		System.out.println("Starting "+Thread.currentThread().getName() + " value is"+this.i);
		try {
			doProcessing();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ending "+ Thread.currentThread().getName() +" value is"+this.i);		
	}

	private void doProcessing() throws InterruptedException {
		Thread.sleep(1000);
		
	}
}

public class ExecutorSimplePoolThread {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(5);
		try {
			for(int i=1;i<=10;i++) {
				Runnable worker=new WorkerThread(i);
				executor.execute(worker);
			}
		}
		finally {
			executor.shutdown();
		}
	}

}

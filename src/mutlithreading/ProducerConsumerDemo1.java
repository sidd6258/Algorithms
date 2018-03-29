package mutlithreading;

class Queue1{
	int i;
	boolean elementSet=false;
	
	public synchronized void put(int i) throws InterruptedException {
		if(elementSet) {
			wait();
		}
		this.i=i;
		System.out.println("Put i"+this.i);
		elementSet=true;
		notify();
	}
	public synchronized void get() throws InterruptedException {
		if(!elementSet) {
			wait();
		}
		System.out.println("Get i"+this.i);
		elementSet=false;
		notify();
	}
}
class Producer2 implements Runnable{
	Queue1 q;
		
	public Producer2(Queue1 q) {
		this.q = q;
		Thread t=new Thread(this, "Producer");
		t.start();
	}

	@Override
	public void run() {
		int i=0;
		while(true) {
			try {
				this.q.put(i++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
	}	
}
class Consumer2 implements Runnable{
	Queue1 q;
	
	public Consumer2(Queue1 q) {
		this.q = q;
		Thread t=new Thread(this, "Consumer");
		t.start();
	}

	@Override
	public void run() {
		while(true) {
			try {
				this.q.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}	
}
public class ProducerConsumerDemo1 {
	public static void main(String[] args) {
		Queue1 q= new Queue1();
		new Producer2(q);
		new Consumer2(q);
	}
}

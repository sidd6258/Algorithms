package mutlithreading;

import java.util.ArrayList;
import java.util.List;

class Q{
	int i;
	boolean elementSet=false;
	
	public synchronized void put(int i){
		if(elementSet){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.i=i;
		System.out.println("Put i "+this.i);
		elementSet=true;
		notify();
	}
	public synchronized void get(){
		if(!elementSet){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Get i "+this.i);
		elementSet=false;
		notify();
	}
}

class Producer implements Runnable{
	Q q;
	static boolean elmentSet=false;

	public Producer(Q q) {		
		this.q = q;	
		Thread t=new Thread(this,"Producer");
		t.start();
		}

	public void run(){
		int i=0;
		while(true){	
			q.put(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}

class Consumer implements Runnable{
	Q q;
	
	public Consumer(Q q) {		
		this.q = q;	
		Thread t=new Thread(this,"Consumer");
		t.start();
		}

	public void run(){
		while(true){
			q.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
	
}

public class ProducerConsumerDemo {
	public static void main(String args[]){
		Q q=new Q();
		new Producer(q);
		new Consumer(q);
	}
}

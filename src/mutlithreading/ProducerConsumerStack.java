package mutlithreading;

import java.util.ArrayList;
import java.util.List;

class A {
	List<Integer> l=new ArrayList<>();
	int i;
	
	public synchronized void put(int i){
		if(l.size()==10){
			try {wait();} catch (InterruptedException e) {}
		}
		this.i=i;
		l.add(this.i);
		System.out.println("Put i "+this.i);
		notify();
	}
	public synchronized void get(){
		if(l.size()==0){
			try {wait();} catch (InterruptedException e) {}
		}
		System.out.println("Get i "+l.get(l.size()-1));
		l.remove(l.size()-1);
		notify();
	}
}

class Producer1 implements Runnable{
	A q;
	public Producer1(A q) {		
		this.q = q;	
		Thread t=new Thread(this,"Producer");
		t.start();
		}

	public void run(){
		int i=0;
		while(true){	
			q.put(i++);
			try {Thread.sleep(100);} catch (InterruptedException e) {}
		}
	}	
}

class Consumer1 implements Runnable{
	A q;
	public Consumer1(A q) {		
		this.q = q;	
		Thread t=new Thread(this,"Consumer");
		t.start();
		}

	public void run(){
		while(true){
			q.get();
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}	
	
}

public class ProducerConsumerStack {
	public static void main(String args[]){
		A q=new A();
		new Producer1(q);
		new Consumer1(q);
	}
}

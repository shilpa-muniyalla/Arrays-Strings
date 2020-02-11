package com.shil.sample.project;

public class ThreadExample implements Runnable {

	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i + Thread.currentThread().getName());
			Thread.yield();
			
		
		try{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	}
		
		public static void main(String[] args) {
			ThreadExample thread1=new ThreadExample();
			ThreadExample thread2=new ThreadExample();
			Thread t1=new Thread(thread1);
			t1.setName("first thread");
			t1.setPriority(Thread.MIN_PRIORITY);
			System.out.println(t1.isAlive());
			
			
			Thread t2=new Thread(thread2);
			t2.setName("second thread");
			t2.setPriority(Thread.MAX_PRIORITY);
			
			//t1.run();
			//t2.run();
			t1.start();
			t2.start();
		}
	}
	



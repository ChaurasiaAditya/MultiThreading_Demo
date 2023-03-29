package com.Aditya.ByInheritence;

public class MultiThreadOne extends Thread {

	private int threadNumber;

	public MultiThreadOne(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	@Override
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " from Thread " + threadNumber);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}

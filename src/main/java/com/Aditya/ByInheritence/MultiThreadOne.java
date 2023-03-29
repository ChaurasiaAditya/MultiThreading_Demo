package com.Aditya.ByInheritence;

public class MultiThreadOne extends Thread {

	private int threadNumber;

	public MultiThreadOne(int threadNumber) {
		this.threadNumber = threadNumber;
	}

//	Without Thread Number
//	@Override
//	public void run(){
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				throw new RuntimeException(e);
//			}
//		}
//	}


//	With ThreadNumber
//	@Override
//	public void run(){
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i + " from Thread " + threadNumber);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				throw new RuntimeException(e);
//			}
//		}
//	}


//	With throwing exception in one thread
	@Override
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " from Thread " + threadNumber);
			if (threadNumber == 3) {
				throw new RuntimeException();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}

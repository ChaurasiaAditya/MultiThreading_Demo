package com.Aditya;

import com.Aditya.ByImplementation.MultiThreadTwo;
import com.Aditya.ByInheritence.MultiThreadOne;

public class Main {
	public static void main(String[] args) {

//      <====     By Inheritance    ====>

		//		With Two Threads
		/*
		MultiThreadOne multiThreadOne = new MultiThreadOne();
		MultiThreadOne multiThreadOne1 = new MultiThreadOne();
		multiThreadOne.start();
		multiThreadOne1.start();
		*/


		// With Thread Loop
		/*
		for (int i = 0; i < 5; i++) {
			MultiThreadOne multiThreadOne = new MultiThreadOne(i);
			multiThreadOne.start();
		}
		*/


		// With throwing exception in one thread
		/*
		for (int i = 0; i < 5; i++) {
			MultiThreadOne multiThreadOne = new MultiThreadOne(i);
			multiThreadOne.start();
		}
		*/

//      <====     By Interface    ====>

		for (int i = 0; i < 5; i++) {
			MultiThreadTwo multiThreadTwo = new MultiThreadTwo(i);
			Thread myThread = new Thread(multiThreadTwo);
			myThread.start();
		}

	}
}
package com.capg.lab8;

import java.util.Timer;
import java.util.TimerTask;

public class Program2 implements Runnable{

	static int counter = 0;
	public static void main(String[] args) {
	
		Program2 obj = new Program2();
		Thread t = new Thread(obj);
		t.start();
	}

	@Override
	public void run() {
	
		while(true)
		{
		try {

			System.out.println(System.currentTimeMillis());
			Thread.sleep(10000);
			
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
	}


	}
}

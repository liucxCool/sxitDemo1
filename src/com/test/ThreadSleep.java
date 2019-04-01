package com.test;

import java.util.concurrent.TimeUnit;

public class ThreadSleep {

	public static void main(String[] args) {

		System.out.println("-------1-------");
		try {

			Thread.sleep(2000);
			System.out.println("-------2-------");

			System.out.println("=============TimeUnit.SECONDS.sleep(3)===================");
			TimeUnit.SECONDS.sleep(3);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("=============TimeUnit.SECONDS.sleep(3)===================");

	}
}

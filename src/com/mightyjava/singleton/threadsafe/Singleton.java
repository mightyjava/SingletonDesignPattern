package com.mightyjava.singleton.threadsafe;

public class Singleton {
	public static void main(String[] args) {
		ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
		System.out.println(singleton);
		ThreadSafeSingleton singleton2 = ThreadSafeSingleton.getInstance();
		System.out.println(singleton2);
	}
}

class ThreadSafeSingleton {
	private static ThreadSafeSingleton singleton = null;
	
	private ThreadSafeSingleton() {
		
	}
	
	//using synchronized block - Its called double locking
	public static ThreadSafeSingleton getInstance() {
		if(singleton == null) {
			synchronized (ThreadSafeSingleton.class) {
				if(singleton == null) {
					singleton = new ThreadSafeSingleton();
				}
			}
		}
		return singleton;
	}
	
	//using synchronized method
	/*public static synchronized ThreadSafeSingleton getInstance() {
		if(singleton == null) {
			singleton = new ThreadSafeSingleton();
		}
		return singleton;
	}*/
}

package com.mightyjava.singleton.lazy;

public class Singleton {
	public static void main(String[] args) {
		LazySingleton singleton = LazySingleton.getInstance();
		System.out.println(singleton);
		LazySingleton singleton2 = LazySingleton.getInstance();
		System.out.println(singleton2);
	}
}

class LazySingleton {
	private static LazySingleton singleton = null;
	
	private LazySingleton() {
		
	}
	
	public static LazySingleton getInstance() {
		if(singleton == null) {
			singleton = new LazySingleton();
		}
		return singleton;
	}
}

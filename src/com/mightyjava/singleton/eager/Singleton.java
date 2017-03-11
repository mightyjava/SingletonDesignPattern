package com.mightyjava.singleton.eager;

public class Singleton {
	public static void main(String[] args) {
		EagerSingleton singleton = EagerSingleton.getInstance();
		System.out.println(singleton);
		EagerSingleton singleton2 = EagerSingleton.getInstance();
		System.out.println(singleton2);
	}
}

class EagerSingleton {
	private static EagerSingleton singleton = new EagerSingleton();
	
	private EagerSingleton() {
		
	}
	
	public static EagerSingleton getInstance() {
		return singleton;
	}
}

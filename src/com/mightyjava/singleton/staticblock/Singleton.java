package com.mightyjava.singleton.staticblock;

public class Singleton {
	public static void main(String[] args) {
		StaticBlockSingleton singleton = StaticBlockSingleton.getInstance();
		System.out.println(singleton);
		StaticBlockSingleton singleton2 = StaticBlockSingleton.getInstance();
		System.out.println(singleton2);
	}
}

class StaticBlockSingleton {
	private static StaticBlockSingleton singleton = null;
	
	static {
		singleton = new StaticBlockSingleton();
	}
	
	private StaticBlockSingleton() {
		
	}
	
	public static StaticBlockSingleton getInstance() {
		return singleton;
	}
}

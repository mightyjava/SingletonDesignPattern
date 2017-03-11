package com.mightyjava.singleton.billpugh;

public class Singleton {
	public static void main(String[] args) {
		BillPughSingleton singleton = BillPughSingleton.getInstance();
		System.out.println(singleton);
		BillPughSingleton singleton2 = BillPughSingleton.getInstance();
		System.out.println(singleton2);
	}
}

class BillPughSingleton {
	private static class SingletonClass {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	private BillPughSingleton() {
		
	}
	
	public static BillPughSingleton getInstance() {
		return SingletonClass.INSTANCE;
	}
}

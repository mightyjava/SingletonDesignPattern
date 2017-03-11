package com.mightyjava.singleton.enumm;

public class Singleton {
	public static void main(String[] args) {
		EnumSingleton singleton = EnumSingleton.INSTANCE;
		System.out.println(singleton.hashCode()); 
		EnumSingleton singleton2 = EnumSingleton.INSTANCE;
		System.out.println(singleton2.hashCode()); 
	}
}

enum EnumSingleton {
	INSTANCE;
}

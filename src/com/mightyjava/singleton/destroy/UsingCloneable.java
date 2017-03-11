package com.mightyjava.singleton.destroy;

public class UsingCloneable {
	public static void main(String[] args) {
		Singleton2 instance = Singleton2.getInstance();
		System.out.println(instance);
		try {
			Singleton2 instance2 = (Singleton2) instance.clone();
			System.out.println(instance2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

class Singleton2 implements Cloneable {
	private static Singleton2 instance = null;
	
	private Singleton2() {
		
	}
	
	static {
		instance = new Singleton2();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		//return getInstance();
		throw new CloneNotSupportedException();
	}
	
	public static Singleton2 getInstance() {
		return instance;
	}
}
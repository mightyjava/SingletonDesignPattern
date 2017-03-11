package com.mightyjava.singleton.destroy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UsingReflection {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton3 instance = Singleton3.getInstance();
		System.out.println(instance);
		
		Singleton3 instance2 = null;
		Constructor<?> [] constructors = Singleton3.class.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			constructor.setAccessible(true);
			instance2 = (Singleton3) constructor.newInstance();
			break;
		}
		System.out.println(instance2);
	}
}

class Singleton3 {
	private Singleton3() {
		if(SingletonHelper.INSTANCE != null) {
			//throw new IllegalArgumentException("Dont try to create multiple instances using reflection");
			System.err.println("Dont try to create multiple instances using reflection");
			System.exit(0);
		}
	}
	
	private static class SingletonHelper {
		private static final Singleton3 INSTANCE = new Singleton3();
	}
	
	public static Singleton3 getInstance() {
		return SingletonHelper.INSTANCE;
	}
}

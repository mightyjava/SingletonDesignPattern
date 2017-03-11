package com.mightyjava.singleton.destroy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ExistingSingleton {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime);
		
		Runtime instance2 = null;
		Constructor<?> [] constructors = Runtime.class.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			constructor.setAccessible(true);
			instance2 = (Runtime) constructor.newInstance();
			break;
		}
		System.out.println(instance2);
	}
}

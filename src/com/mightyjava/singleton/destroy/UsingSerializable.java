package com.mightyjava.singleton.destroy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UsingSerializable {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		System.out.println(instance);
		
		try {
			ObjectOutput output = new ObjectOutputStream(new FileOutputStream("object.ser"));
			output.writeObject(instance);
			output.close();
			
			ObjectInput input = new ObjectInputStream(new FileInputStream("object.ser"));
			Singleton instance2 = (Singleton) input.readObject();
			System.out.println(instance2);
			input.close();
		} catch (IOException | ClassNotFoundException e) { 
			e.printStackTrace();
		}
	}
}

class Singleton implements Serializable {
	private static final long serialVersionUID = -7269837245888388672L;
	private static Singleton instance = null;
	
	private Singleton() {
		
	}
	
	private Object readResolve() {
		return getInstance();
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

package javabeginner3;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.IOException;

public class Teenager implements Externalizable{
	
	private String name;
	private int age;
	private float height;
	
	public Teenager() {};
	public Teenager(String name,int age,float height) {
		this.name=name;
		this.age=age;
		this.height=height;
	}
	public void show() {
		System.out.println("My name is "+name+", I'm "+age+" years old. And I'm "+height+" meters tall");
	}
	public void writeExternal(ObjectOutput out) throws IOException{
		out.writeObject(name);
		out.writeObject(age);
		out.writeObject(height);
	}
	public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException{
		this.name=(String)in.readObject();
		this.age=(int)in.readObject();
		this.height=(float)in.readObject();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

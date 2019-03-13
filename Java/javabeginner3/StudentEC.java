package javabeginner3;

import javabeginner2.PersonFC;
import java.io.Serializable;

@SuppressWarnings("serial")
public class StudentEC extends PersonFC implements Serializable{
	
	private String school;
	private String nameStu;
	public StudentEC() {};
	public StudentEC(String name,int age,String school) {
		setName(name);
		this.nameStu=name;
		super.setAge(age);
		this.school=school;
		this.tellIdentify();
	}
	public void tellStuID() {
		System.out.println("My name is "+nameStu+". I'm "+super.getAge()+" And I'm in "+this.school);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

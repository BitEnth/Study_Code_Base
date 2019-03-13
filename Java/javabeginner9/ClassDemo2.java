package javabeginner9;

public class ClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?>c1=null;
		Student1 stu1=null;
		try {
			c1=Class.forName("javabeginner9.Student1");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			stu1=(Student1)c1.newInstance();
		}catch(InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stu1.setName("Gauss");
		stu1.setAge(54);
		System.out.println("The information of object: "+stu1);
	}

}

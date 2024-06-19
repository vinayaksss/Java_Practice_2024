package arrays;

public class Student {
	
	String Name;
	int age;
	public Student(String name, int age) {
		
		Name = name;
		this.age = age;
	}
	
	public void display() {
		 System.out.println("Name: " + Name + ", Age: " + age);
		
	}
	

}

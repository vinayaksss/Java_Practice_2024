package oopsConcepts;

public class encapsulationcls {
	
	private String name;
	
	private int age;

	public String getName() {
		System.out.println("Get Name "+name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getAge() {
		
		if(age>0) {
			System.out.println("  "+age );	
		}else {
		System.out.println("invaild");
		}
	}

	public void setAge(int age) {
		
		if(age>0) {
		this.age=age;
		}else
		{
			System.out.println("not elgiable");
		}
	}
}

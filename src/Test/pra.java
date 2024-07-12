package Test;

public class pra {

	private String name;
	
	private int age;
	
	

	public pra(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	

	@Override
	public String toString() {
		return " " + name + " " + age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

package Test;

public class LinkObje {
	String name;
	String add;
	String surname;

	public LinkObje(String name, String add, String surname) {
		this.name = name;
		this.add = add;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "LinkObje [name=" + name + ", add=" + add + ", surname=" + surname + "]";
	}

}

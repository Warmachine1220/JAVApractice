
public class Person {
	private String name;
	private String email;
	private int phone;

	public Person(String name) {
		this.name = name;

		System.out.println(45435);
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getPhone() {
		return phone;
	}

	public String toString() {
		return name + " " + email + " " + phone;
	}

}

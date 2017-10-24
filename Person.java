
public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String toString() {
		return firstName + " " + lastName + " age: " + age;
	}
	public boolean equals(Object o) {
		Person p = (Person) o;
		return firstName.equals(p.firstName) &&
			lastName.equals(p.lastName) &&
			age == p.age;
	}

}

package HW3;

public class Pet {

	private String name;
	private int age;
	private String location;
	private String type;
	
	public Pet() {
		System.out.println("New Pet with no attributes created.");
	}
	
	public Pet(String name, int age, String location, String type) {
		System.out.println("New Pet created.");
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getType() {
		return type;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public void setLocation(String newLoc) {
		location = newLoc;
	}
	
}


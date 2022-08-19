import java.util.Comparator;

public class Employees implements Comparator<Object>{
	private int id;
	private String name;
	private int age;
	private long phoneNumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public int compare(Object o1, Object o2) {
	
		return 0;
	}
	
	
	
	

}

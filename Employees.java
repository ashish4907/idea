import java.util.Comparator;

public class Employees implements Comparator<Employee> {
		private int id,age;
		private String name;
		private long number;
		
		
		@Override
		public int compare(Employee o1, Employee o2) {
			
			return 0;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public long getNumber() {
			return number;
		}


		public void setNumber(long number) {
			this.number = number;
		}



		
		
		

}

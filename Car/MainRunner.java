import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MainRunner {
	public static void main(String[] args) {

		Employee e1 = new Employee(105, "Nidhi");
		Employee e2 = new Employee(101, "Ashish");
		Employee e3 = new Employee(101, "Shreya");
		Employee e4 = new Employee(109, "Megha");
		Employee e5 = new Employee(109, "Megha");

		HashMap<String,Employee> hashmap = new HashMap<String,Employee>();
		hashmap.put( "First",e1);
		hashmap.put( "Second",e2);
		hashmap.put("Third",e3);
		hashmap.put("Fourth",e4);
		hashmap.put("Fifth",e5);

		System.out.println(hashmap);

		List<Employee> sortedValueList = hashmap.values().stream().distinct()
				.sorted((o1, o2) -> o2.name.compareTo(o1.name)).collect(Collectors.toList());

		System.out.println("Sorted Values: " + sortedValueList);

	}
}

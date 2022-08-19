import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MainRunners {
	public static void main(String[] args) {
		Employees e1 = new Employees();
		e1.setId(105);
		e1.setName("Nidhi");
		Employees e2 = new Employees();
		e2.setId(101);
		e2.setName("Ashish");
		Employees e3 = new Employees();
		e3.setId(101);
		e3.setName("Shreya");

		Employees e4 = new Employees();
		e4.setId(109);
		e4.setName("Megha");
		Employees e5 = new Employees();
		e5.setId(109);
		e5.setName("Megha");

		HashMap<String,Employees> hashmap = new HashMap<String,Employees>();
		hashmap.put("First",e1);
		hashmap.put( "Second",e2);
		hashmap.put( "Third",e3);
		hashmap.put( "Fourth",e4);
		hashmap.put( "Fifth",e5);

		System.out.println(hashmap.values());

		List<Employees> sortedValueList = hashmap.values().stream().distinct()
				.sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());

		System.out.println("Sorted Values: " + sortedValueList);

	}
}


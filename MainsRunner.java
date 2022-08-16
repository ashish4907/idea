import java.util.ArrayList;
import java.util.Collections;


public class MainsRunner {
	public static void main(String[] args) {
		Student s1 = new Student(101,"Ashish");
		Student s2 = new Student(102,"Shraddha");
		Student s3 = new Student(103,"Shreya");
		Student s4 = new Student(104,"Shivani");
		Student s5 = new Student(105,"Aman");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.sort(new Student());
		System.out.println(list);
		
//		list.sort((o1,o2) -> o1.name.compareTo(o2.name));
//		Collections.sort(list,(o1,o2)->o1.name.compareTo(o2.name));
//		
	}

}

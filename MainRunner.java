import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainRunner {
	public static void main(String[] args) {

		Object[] objlist = { new BMW(), new Audi(), new BMW(), new Audi() };

		System.out.println("-----using arrays-----");

		for (Object obj : objlist) {
			if (obj instanceof BMW) {

				System.out.println("Belongs TO BMW");

			} else if (obj instanceof Audi) {

				System.out.println("Belongs TO Audi");
			}
		}
		System.out.println("-----using collection-----");
		List<Object> al = Arrays.asList(objlist);
		List<BMW> bmw = new ArrayList<>();
		List<Audi> audi = new ArrayList<>();
		for (Object obj : al) {
			if (obj instanceof BMW) {
				bmw.add((BMW) obj);
				System.out.println("Belongs TO BMW");
			} else if (obj instanceof Audi) {

				audi.add((Audi) obj);
				System.out.println("Belongs TO Audi");
			}
		}
		System.out.println("-----Iterating BMW-----");
		Iterator<BMW> iter1 = bmw.iterator();
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		System.out.println("-----Iterating Audi-----");
		
		Iterator<Audi> iter2 = audi.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}

	}

}

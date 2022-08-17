import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Vehicle {

	public static void main(String[] args) {

		ArrayList<Object> arraylist = new ArrayList<Object>();
		arraylist.add(new BMW("320d"));
		arraylist.add(new Audi("A3"));
		arraylist.add(new Tata("Nexon"));
		arraylist.add(new Hyundai("City"));
		arraylist.add(new Mahindra("Scorpio"));
		arraylist.add(new BMW("450f"));
		arraylist.add(new Audi("A5"));
		arraylist.add(new Tata("Safari"));
		arraylist.add(new Hyundai("Creta"));
		arraylist.add(new Mahindra("Bolero"));

		ArrayList<BMW> bmwlist = new ArrayList<BMW>();
		ArrayList<Audi> audilist = new ArrayList<Audi>();
		ArrayList<Tata> tatalist = new ArrayList<Tata>();
		ArrayList<Hyundai> hyundailist = new ArrayList<Hyundai>();
		ArrayList<Mahindra> mahindralist = new ArrayList<Mahindra>();
		for (Object obj : arraylist) {
			if (obj instanceof BMW) {
				BMW bmw = (BMW) obj;
				bmwlist.add(bmw);
			} else if (obj instanceof Audi) {
				Audi audi = (Audi) obj;
				audilist.add(audi);

			} else if (obj instanceof Tata) {

				Tata tata = (Tata) obj;
				tatalist.add(tata);

			} else if (obj instanceof Hyundai) {
				Hyundai hyundai = (Hyundai) obj;
				hyundailist.add(hyundai);

			} else if (obj instanceof Mahindra) {
				Mahindra mahindra = (Mahindra) obj;
				mahindralist.add(mahindra);

			}
		}
		System.out.println(bmwlist);
		System.out.println(audilist);
		System.out.println(tatalist);
		System.out.println(hyundailist);
		System.out.println(mahindralist);

		System.out.println("---------Before Sorting------------");
		Vehicle vehicle = new Vehicle();
		vehicle.toIterate(arraylist);
		System.out.println("---------After Sorting------------");
		List<Object> sortedlist = vehicle.getSorted(arraylist);
		vehicle.toIterate(sortedlist);

	}

	private void toIterate(List<Object> sortedlist) {
		Iterator<Object> iterator = sortedlist.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

	}

	private List<Object> getSorted(List<Object> carlist) {

		carlist.sort((o1, o2) -> o1.toString().compareTo(o2.toString()));
		return carlist;

	}

}

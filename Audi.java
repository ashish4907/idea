import java.util.Comparator;

public class Audi implements Comparator<Object> {
	String model;

	public Audi(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Audi [model=" + model + "]";
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}

import java.util.Comparator;

public class Tata implements Comparator<Object>{
	String model;

	public Tata(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Tata [model=" + model + "]";
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}

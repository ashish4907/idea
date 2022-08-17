import java.util.Comparator;

public class Hyundai implements Comparator<Object>{
	String model;

	public Hyundai(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Hyundai [model=" + model + "]";
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}

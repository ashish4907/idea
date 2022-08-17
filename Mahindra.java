import java.util.Comparator;

public class Mahindra implements Comparator<Object>{
	String model;

	public Mahindra(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Mahindra [model=" + model + "]";
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	
}

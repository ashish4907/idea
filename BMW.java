import java.util.Comparator;

public class BMW implements Comparator<Object>{
	String model;

	public BMW(String model) {
		this.model = model;
	}

	public BMW() {
	
	}

	@Override
	public String toString() {
		return "BMW [model=" + model + "]";
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}

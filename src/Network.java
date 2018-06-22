import java.awt.List;
import java.util.ArrayList;

public class Network {

	private String name;
	ArrayList<Integer> numbers = new ArrayList();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList getNumbers() {
		return numbers;
	}
	public void setNumbers(ArrayList numbers) {
		this.numbers = numbers;
	}
	public Network(String name) {
		super();
		this.name = name;
	}
	public Network() {
		super();
	}
	@Override
	public String toString() {
		return "Network [name=" + name + ", numbers=" + numbers + "]";
	}
	
	
	
}

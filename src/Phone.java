
public class Phone {

	private int number;
	private String model;
	
	public void registration(Network network) {
		boolean exist = false;
		for(int i = 0; i < network.numbers.size(); i++) {
			if(number == network.numbers.get(i)) {
				  exist = true;
				  System.out.println("Number is already exist!");
			}
		}
		if(exist == false) {
			network.numbers.add(number);
		}
	}
	
	public void call(Network network, int number) {
		boolean exist = false;
		for(int i = 0; i < network.numbers.size(); i++) {
			if(number == network.numbers.get(i) && this.number != number) {
				System.out.println("Aloha");
				  exist = true;
				  break;
			}
		}
		if(exist == false) {
			System.out.println("Number is not exist!");
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Phone(int number, String model) {
		super();
		this.number = number;
		this.model = model;
	}

	public Phone() {
		super();
	}

	@Override
	public String toString() {
		return "Phone [number=" + number + ", model=" + model + "]";
	}
	

}

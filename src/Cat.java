
public class Cat {

	private String color;
	private String name;
	private int weight;
	private int age;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    Cat(){}
	public Cat(String color, String name, int weight, int age) {
		super();
		this.color = color;
		this.name = name;
		this.weight = weight;
		this.age = age;
	};
	
	public boolean isSame(Cat catAnother) {
		if(this.color == catAnother.color && this.weight == catAnother.weight && this.age == catAnother.age) {
			return true;
		}
		else {
			return false;
		}
		
	}
	@Override
	public String toString() {
		return "Cat [color=" + color + ", name=" + name + ", weight=" + weight + ", age=" + age + "]";
	}
	
    
}

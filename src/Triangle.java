
public class Triangle {

	private int firstSide;
	private int secondSide;
	private int thirdSide;
	
	public int getFirstSide() {
		return firstSide;
	}
	public void setFirstSide(int firstSide) {
		this.firstSide = firstSide;
	}
	public int getSecondSide() {
		return secondSide;
	}
	public void setSecondSide(int secondSide) {
		this.secondSide = secondSide;
	}
	public int getThirdSide() {
		return thirdSide;
	}
	public void setThirdSide(int thirdSide) {
		this.thirdSide = thirdSide;
	}
	public Triangle(int firstSide, int secondSide, int thirdSide) {
		super();
		this.firstSide = firstSide;
		this.secondSide = secondSide;
		this.thirdSide = thirdSide;
	}
	
	public Triangle() {}
	
	public double Area(){
		int p;
		
		p = (firstSide + secondSide + thirdSide) / 2;
		
		return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
		
	}
	@Override
	public String toString() {
		return "Triangle [firstSide=" + firstSide + ", secondSide=" + secondSide + ", thirdSide=" + thirdSide + "]";
	}
	
}

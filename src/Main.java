
public class Main {

	public static void main(String[] args) {
		Test_1();
		Test_2();
		Test_3();
		Test_4();
	}
	
	static void Test_1() {
		Cat vasya = new Cat("Black", "Vasya", 10, 8);
		Cat murka = new Cat("White", "Murka", 8, 7);
		
		System.out.println(vasya);
		System.out.println(murka);
		System.out.println("");
		System.out.println("Cats are same: " + vasya.isSame(murka));
		System.out.println("====================");
		
		vasya.setColor("White");
		vasya.setWeight(8);
		murka.setAge(8);
		
		System.out.println(vasya);
		System.out.println(murka);
		System.out.println("");
		System.out.println("Cats are same: " + vasya.isSame(murka));
		System.out.println("====================");
	}
	
	static void Test_2() {
		Triangle firstTriangle = new Triangle(3, 4, 5);
		Triangle secondTriangle = new Triangle(6 , 8, 10);
		
		System.out.println("Area: " + firstTriangle.Area());
		System.out.println("Area: " + secondTriangle.Area());
		System.out.println("");
		System.out.println("Areas are same: " + (firstTriangle.Area() == secondTriangle.Area()));
		System.out.println("====================");
		
		firstTriangle.setFirstSide(6);
		firstTriangle.setSecondSide(8);
		firstTriangle.setThirdSide(10);
		
		System.out.println("Area: " + firstTriangle.Area());
		System.out.println("Area: " + secondTriangle.Area());
		System.out.println("");
		System.out.println("Areas are same: " + (firstTriangle.Area() == secondTriangle.Area()));
		System.out.println("====================");
	}
	
	static void Test_3() {
		Vector3D vectorOne = new Vector3D(1, 2, 3);
		Vector3D vectorTwo = new Vector3D(2, 3, 1);
		
		System.out.println(vectorOne);
		System.out.println(vectorTwo);
		System.out.println("");
		System.out.println("Addition of vectors: " + Vector3D.addition(vectorOne, vectorTwo));
		System.out.println("Scalar addition of vectors: " + Vector3D.scalaraddition(vectorOne, vectorTwo));
		System.out.println("Vector Addition of vectors: " + Vector3D.vectorAddition(vectorOne, vectorTwo));
		System.out.println("====================");
	}
	
	static void Test_4() {
		Phone iPhone = new Phone(123, "iPhone");
		Phone demoPhone = new Phone(321, "demoOnePhone");
		Network mts = new Network("MTS");
		
		demoPhone.registration(mts);
		iPhone.registration(mts);
		iPhone.call(mts, 321);
		iPhone.call(mts, 666);
		System.out.println("");
		System.out.println(mts);
		System.out.println("====================");
	}
}

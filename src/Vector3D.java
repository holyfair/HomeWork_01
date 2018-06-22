
public class Vector3D {

	private int x;
	private int y;
	private int z;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public Vector3D(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Vector3D() {
		super();
	}
	
	static double scalaraddition(Vector3D firstVector, Vector3D secondVector) {
		return firstVector.x * secondVector.x + firstVector.y * secondVector.y + 
				firstVector.z * secondVector.z;
	}
	
	static Vector3D addition(Vector3D firstVector, Vector3D secondVector) {
		return new Vector3D(firstVector.x + secondVector.x, firstVector.y + secondVector.y,
				firstVector.z + secondVector.z);
	}
	
	static Vector3D vectorAddition(Vector3D firstVector, Vector3D secondVector) {
		return new Vector3D((firstVector.y * secondVector.z - firstVector.z * secondVector.y),
				(firstVector.z * secondVector.x - firstVector.x * secondVector.z),
				(firstVector.x * secondVector.y - firstVector.y * secondVector.x));
	}
	@Override
	public String toString() {
		return "Vector3D [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}

public class hijo extends padre{

	private int edad;
	
	public hijo (int edad) {
		this.edad = edad;
	}
	
	public String toString() {
		return super.toString() + ",edad:" + edad;
	}
}
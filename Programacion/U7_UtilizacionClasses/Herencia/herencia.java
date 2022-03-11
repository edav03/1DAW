public class herencia {

	public static void main(String[] args) {
		
		hijo h = new hijo(1);
		padre p = new padre("padre");
		abuelo a1 = new abuelo("abuelo");

			
		abuelo a2 = new hijo(2);

		System.out.println("h:" + h); 
		System.out.println("p:" + p); 
		System.out.println("a1:" + a1); 
		System.out.println("a2:" + a2); 
		System.out.println("h:" + (abuelo)h); 
	}
}
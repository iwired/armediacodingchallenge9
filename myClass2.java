package armedia;

public class myClass2 {


		
	static void clsMethod1() {
			try {
				clsMethod2();

				System.out.println("a");

			} catch (ArithmeticException e) { System.out.println("b"); }
			   finally {System.out.println ("c"); }
			
			System.out.println("d");
		}

	static void clsMethod2() {
			throw new NullPointerException();
		}
	public static void main(String[] args) {
		try {
		    clsMethod1();
		} catch (Exception e) {}
	}

}

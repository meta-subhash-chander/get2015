package Throws_example;
class Custom_Exception {
	static void check() throws ArithmeticException {
		System.out.println("Inside check function");
		throw new ArithmeticException("Custom Exception");
	}

	public static void main(String args[]) {
		try {
			check();
		} catch (ArithmeticException e) {
			System.out.println("caught " + e); 
		}
	}
}
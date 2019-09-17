
public class Driver {

	public static void main(String[] args) {
		RecursiveMathLib recursionLibrary
			= new RecursiveMathLib();
		IterationMathLib iterationLibrary 
			= new IterationMathLib();
		System.out.println("---- Recursion -----");
		runTestCode(recursionLibrary);
		System.out.println("---- Iteration -----");
		runTestCode(iterationLibrary);

	}
	public static void runTestCode(Mathlib library) {
		System.out.println("GCD of 4,2 = "
				+library.gcd(4, 2));
		System.out.println("Ack of 1, 2 = "
				+library.ack(1, 2));
		System.out.println("Fib of 10 = "
				+library.fib(10));
		System.out.println("Hanoi of 4 = "
				+library.hanoi(4));
	}

}

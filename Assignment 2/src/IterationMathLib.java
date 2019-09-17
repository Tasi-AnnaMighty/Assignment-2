
public class IterationMathLib
extends Mathlib{

	@Override
	int gcd(int x, int y) {
		int temp;
		while (y!=0) {
			if(x>=y && x!= 0) {
				temp = x;
				x = y;
				y = temp % y;
			}
		}
		return x;
	}

	@Override
	int ack(int x, int y) {
		
	}
	
	@Override
	int fib(int x) {
		int temp;
		while (x > 1) {
			if (x =)
		}
	}
	
	@Override
	int hanoi(int n) {
		int a;
		int b;
		while (n != 0) {
			if (n > 1)
		}
		
	}
}

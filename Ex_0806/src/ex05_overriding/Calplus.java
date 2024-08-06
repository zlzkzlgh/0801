package ex05_overriding;

public class Calplus extends Calculator{

	@Override
	int getResult(int n1, int n2) {
		
		return n1+n2;
	}
}

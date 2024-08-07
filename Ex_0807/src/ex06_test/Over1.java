package ex06_test;

public class Over1 {
	public static void main(String[] args) {
		Over1 a1 = new Over1();
		Over2 a2 = new Over2();
				
		System.out.println(a1.sum(3,2) + a2.sum(3,2));
	}
	
	int sum(int x,int y) {
		return x + y;
	}
}

class Over2 extends Over1{
	@Override
	int sum(int x, int y) {
		return x - y + super.sum(x, y);
	}
}
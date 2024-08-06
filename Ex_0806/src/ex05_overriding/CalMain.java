package ex05_overriding;

public class CalMain {
	public static void main(String[] args) {
		Calplus cp = new Calplus();
		CalMinus cm = new CalMinus();
		
		System.out.println("Calplus : "+ cp.getResult(15, 15));
		System.out.println("CalMinus : "+ cm.getResult(30, 15));
	}
}
